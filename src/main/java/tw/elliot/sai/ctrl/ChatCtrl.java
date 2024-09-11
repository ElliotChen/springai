package tw.elliot.sai.ctrl;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.elliot.sai.service.RagService;

@RestController
@RequestMapping("/ai")
public class ChatCtrl {
    @Autowired
    private RagService ragService;

    @GetMapping("/chat")
    public Map<String, String> chat(@RequestParam String query) {
        String answer = ragService.findAnswer(query);
        return Map.of("answer", answer);
    }
}
