package tw.elliot.sai.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmbeddingServiceTest {

    @Autowired
    private EmbeddingService embeddingService;

    @Test
    public void testLoadMd() {
        embeddingService.loadData();
    }
}