package com.naidiuk.producer.web;

import com.naidiuk.producer.service.NewsProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
@RequiredArgsConstructor
public class NewsController {
    private final NewsProducer newsProducer;

    @PostMapping
    public void postNews(@RequestBody String news) {
        newsProducer.sendNews(news);
    }
}
