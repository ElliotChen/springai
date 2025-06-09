package tw.elliot.sai.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class RagServiceTest {
    @Autowired
    private RagService ragService;
    @Test
    public void test() {
        String answer = ragService.findAnswer("how to find all stations?");

        log.info("Answer: {}", answer);
    }
}
