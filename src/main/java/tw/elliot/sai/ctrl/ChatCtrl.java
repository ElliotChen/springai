package tw.elliot.sai.ctrl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.elliot.sai.dto.Question;
import tw.elliot.sai.service.EmbeddingService;
import tw.elliot.sai.service.RagService;

@RestController
@RequestMapping("/ai")
public class ChatCtrl {
    @Autowired
    private RagService ragService;

    @Autowired
    private EmbeddingService embeddingService;

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Question question) {
        String answer = ragService.findAnswer(question.getQuestion());
        return Map.of("answer", answer);
    }

    @GetMapping("/loadData")
    public List<String> loadProvidedData() {
        return embeddingService.loadProvidedData();
    }

}
