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
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmbeddingService {
  @Value("classpath:test.md")
  private Resource mdResource;

  @Autowired private VectorStore vectorStore;

  public void embed(String text) {
    TokenTextSplitter splitter = new TokenTextSplitter();
    List<Document> split = splitter.split(new Document(text));
    vectorStore.add(split);
  }

  public void loadData() {
    DocumentReader reader = new MarkdownDocumentReader(mdResource, MarkdownDocumentReaderConfig.builder()
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
