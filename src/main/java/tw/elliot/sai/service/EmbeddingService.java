package tw.elliot.sai.service;

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

  public void loadData() {
    // Resource resource =

    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(this.resourceLoader);

      try {
        Resource[] resources = resolver.getResources("classpath*:*.md");
        log.info("Resources: {}", resources.length);

        for (Resource resource : resources) {
            log.info("Resource: {}", resource.getURL());
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

