package com.naidiuk.consumersql.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naidiuk.consumersql.entity.News;
import com.naidiuk.consumersql.service.NewsService;
import com.naidiuk.consumersql.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsConsumer {
    private final NewsService newsService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = Constants.NEWS_TOPIC, groupId = Constants.GROUP_ID)
    public void consumeNews(String message) throws JsonProcessingException {
        News news = objectMapper.readValue(message, News.class);
        newsService.save(news);
    }
}
