## Local LLM Rag - 整合 Spring AI, Ollama, Redis stack



## 前言

有了Ollama後，很想在本地端建立個人的RAG，因為不是很想每次都在一堆目錄裡搜索，看了很多不同的實踐方式，最後還是想想用自己熟悉的語言來進行。

本來是想用Milvus做為Vector Database的，但實驗多次，都遇到`dimension`錯誤而無法寫入，但單獨寫卻也還可以，只是整在Spring AI下都不成功，所以改用Redis Stack，後續就很順利了。

這裡主要是參考[Spring AI Meets Qdrant and Ollama: A Triad for Transformative Document Analysis](https://blog.stackademic.com/spring-ai-meets-qdrant-and-ollama-a-triad-for-transformative-document-analysis-95b99e3d9af7)，但因為原作者用的應該是Spring AI 0.8.0的版本，與現行可以看到的1.0.0M2有不小的差異，所以分段改寫了一下。

## 設定步驟

### Ollama

![Screenshot 2024-09-11 at 13.41.39](https://picgo.ap-south-1.linodeobjects.com/20240911/8c5fc9862f76f148b50330e42d24cf74.png)

我用的Model是`llama3.1:latest`，Embedding Model則是`nomic-embed-test:latest`，可以用

```
ollama pull nomic-embed-test
ollama pull llama3.1
```

拉回需要的model

### Redis Stack

最簡單的方式就是用docker compose，下列為我用的yaml檔案。

```yaml
services:
  redis-stack:
    image: redis/redis-stack
    environment:
       - TZ=Asia/Taipei
    ports:
      - 6379:6379
      - 8001:8001
    volumes:
      - ./data:/data
```

### Spring ai project

Source Code我放在Github上 [Spring AI](https://github.com/ElliotChen/springai)，有問題可以直下看看。

#### Spring ai starter

主要是這兩個starter，分別對應ChatModel與Vector Database的用途

```
		<dependency>
      <groupId>org.springframework.ai</groupId>
      <artifactId>spring-ai-redis-store-spring-boot-starter</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.ai</groupId>
      <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
    </dependency>
```

#### Markdown Reader

再來是將markdown文件轉為Spring AI訂義的Document的Library，若是想讀PDF的就要換其他的Library。

````
    <dependency>
      <groupId>org.springframework.ai</groupId>
      <artifactId>spring-ai-markdown-document-reader</artifactId>
      <version>1.0.0-M2</version>
    </dependency>
````

#### application.yaml

```
spring:
	ai:
    ollama:
      baseUrl: "http://localhost:11434"
      embedding:
        model: "nomic-embed-text"
      chat:
        model: "llama3.1:latest"
        options:
          model: "llama3.1:latest"
          temperature: 0.3
          top-k: 2
          top-p: 0.2
          num-g-p-u: 1
    vectorstore:
      redis:
        uri: "redis://localhost:6379"
        initialize-schema: true
        embeddingDimension: 768
```

這裡把我可用的spring project設定列出

### 滙入Markdown作為RAG的資料來源

在EmbeddingService.java裡，使用簡單的Reader讀取md檔，然後轉為Document，再存入Vector Database

```java
public class EmbeddingService {
  @Value("classpath:test.md")
  private Resource mdResource;

  @Autowired private VectorStore vectorStore;

  public void loadData() {
    DocumentReader reader = new MarkdownDocumentReader(mdResource, MarkdownDocumentReaderConfig.builder()
        .withIncludeCodeBlock(true)
        .withIncludeBlockquote(true)
        .build());

    TokenTextSplitter splitter = new TokenTextSplitter();
    this.vectorStore.accept(splitter.split(reader.read()));
  }

}
```

這裡簡單的讀取test.md檔案，然後存入VectorStore中，這裡MarkdownDocumentReader會將檔案分割為多個檔案(chunks)

![Screenshot 2024-09-11 at 13.18.16](https://picgo.ap-south-1.linodeobjects.com/20240911/bfb01e57b623663c6b64b4295cced57b.png)

Redis裡可以看到存入的格式與內容

![Screenshot 2024-09-11 at 13.59.33](https://picgo.ap-south-1.linodeobjects.com/20240911/1ecb8fdfdc33f915d52789bbfe46e979.png)



### 取得RAG的資料供LLM使用

```java
public class RagService {

    @Autowired
    private VectorStore vectorStore;

    @Autowired
    private ChatModel chatModel;

    public String findAnswer(String query) {
        Message ragDoc = this.getRagDoc(query);
        List<Message> messages = List.of(
            ragDoc, new UserMessage(query));
        ChatResponse aiResponse = chatModel.call(new Prompt(messages));

        return aiResponse.getResult().getOutput().getContent();
    }
    public Message getRagDoc(String query) {
        log.info("Query: {}", query);
        List<Document> documents = this.vectorStore.similaritySearch(query);
        log.info("Documents: size[{}]", documents.size());

        String collect = documents
            .stream()
            .map(Document::getContent)
            .collect(Collectors.joining("\n"));

        log.info("Collect: {}", collect);
        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(query);


        return systemPromptTemplate.createMessage(Map.of("documents", collect));
    }
}
```

這裡分為兩段，先以`getRagDoc`來取得Vector Database裡的資料，例如下面這樣，找出接近的內容

```
this.vectorStore.similaritySearch(query)
```

再與Prompt合併

```
systemPromptTemplate.createMessage(Map.of("documents", collect))
```

最後在透過ChatModel整合原有的資料後送出

```
List.of(ragDoc, new UserMessage(query));
chatModel.call(new Prompt(messages));
```



## 總結

說穿了不過就幾件事

1. 分割檔案為合適的內容，畢竟Garbage in, garbage out
2. 轉為指定Embedding Model的格式存入Vector Database
3. 先自Vector Database找可用的資料，交與LLM供其使用。

初步做其實還蠻容易的，但準確度要提升真的還頗有難度。
