package tw.elliot.sai.service;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.document.Document;
import org.springframework.ai.document.DocumentReader;
import org.springframework.ai.reader.markdown.MarkdownDocumentReader;
import org.springframework.ai.reader.markdown.config.MarkdownDocumentReaderConfig;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmbeddingService {
  @Value("classpath:test.nk")
  private Resource mdResource;

  @Autowired private VectorStore vectorStore;

  @Autowired
  private ResourceLoader resourceLoader;

  public void embed(String text) {
    TokenTextSplitter splitter = new TokenTextSplitter();
    List<Document> split = splitter.split(new Document(text));
    vectorStore.add(split);
  }

  public List<String> loadProvidedData() {
    return this.loadData("classpath:/tmp/*.md");
  }
  public List<String> loadDefaultData() {
    return this.loadData("classpath:*.md");
  }
  public List<String> loadData(String resourcePath) {
    // Resource resource =

    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(this.resourceLoader);
    ArrayList<String> list = new ArrayList<>();
    Resource[] resources;
      try {
        resources = resolver.getResources(resourcePath);
        log.info("Resources: {}", resources.length);

        for (Resource resource : resources) {
            log.info("Resource: {}", resource.getURL());
          list.add(resource.getURL().toString());
            DocumentReader reader = new MarkdownDocumentReader(resource, MarkdownDocumentReaderConfig.builder()
                .withIncludeCodeBlock(true)
                .withIncludeBlockquote(true)
                .build());

            TokenTextSplitter splitter = new TokenTextSplitter();
            this.vectorStore.accept(splitter.split(reader.read()));
        }
      } catch (Exception e) {
        log.error("Error: {}", e.getMessage());
          throw new RuntimeException(e);
      }

      return list;


  }

  public void exportToEmbedding(Resource resource) {
    DocumentReader reader = new MarkdownDocumentReader(resource, MarkdownDocumentReaderConfig.builder()
        .withIncludeCodeBlock(true)
        .withIncludeBlockquote(true)
        .build());

    TokenTextSplitter splitter = new TokenTextSplitter();
    this.vectorStore.accept(splitter.split(reader.read()));
  }
  public void embedMd() {
    log.info("Embedding MD is exist?: {}", mdResource.exists());
  }
}

