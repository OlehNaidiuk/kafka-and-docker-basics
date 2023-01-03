package com.naidiuk.producer.service;

import com.naidiuk.producer.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendNews(String news) {
        kafkaTemplate.send(Constants.NEWS_TOPIC, news);
    }
}
