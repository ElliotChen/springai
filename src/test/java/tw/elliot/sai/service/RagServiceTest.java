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
        String csc_狀態查詢 = ragService.findAnswer("請找出CSC 狀態查詢的api規格");

        log.info("Answer: {}", csc_狀態查詢);
    }
}
