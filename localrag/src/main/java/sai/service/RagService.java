package tw.elliot.sai.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.ChatClient.CallResponseSpec;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RagService {

    @Autowired
    ChatClient chatClient;


    public String findAnswer(String query) {
        CallResponseSpec call = chatClient
            .prompt("You are a software engineer, you will find the suitable api specification for question.")
            .user(query)
            .call();

        return call.content();
    }
//    public Message getRagDoc(String query) {
//        log.info("Query: {}", query);
//        List<Document> documents = this.vectorStore.similaritySearch(query);
//        log.info("Documents: size[{}]", documents.size());
//
//        String collect = documents
//            .stream()
//            .map(Document::getContent)
//            .collect(Collectors.joining("\n"));
//
//        log.info("Collect: {}", collect);
//        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(query);
//
//
//        return systemPromptTemplate.createMessage(Map.of("documents", collect));
//    }
}
