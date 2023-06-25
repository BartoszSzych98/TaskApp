package com.crud.tasks.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ConfigTestSuite {

    @Autowired
    private AdminConfig adminConfig;

    @Autowired
    private TrelloConfig trelloConfig;

    @Test
    void getAdminMail() {
        //When
        String result = adminConfig.getAdminMail();

        //Then
        assertEquals("bartoszych17@gmail.com", result);
    }

    @Test
    void getTrelloConfigTest() {
        //When
        String apiEndpoint = trelloConfig.getTrelloApiEndpoint();
        String appKey = trelloConfig.getTrelloAppKey();
        String trelloToken = trelloConfig.getTrelloToken();
        String trelloUsername = trelloConfig.getTrelloUsername();

        //Then
        assertEquals("https://api.trello.com/1", apiEndpoint);
        assertEquals("66dc9d0b274d4cdb6a96b99c923c8673", appKey);
        assertEquals("ATTA09fb4b8dd9237e7c1eab66d76d4b38c2c1b612337cedc0aaddea41eb85a846b97F608403", trelloToken);
        assertEquals("bartoszszych", trelloUsername);
    }
}
