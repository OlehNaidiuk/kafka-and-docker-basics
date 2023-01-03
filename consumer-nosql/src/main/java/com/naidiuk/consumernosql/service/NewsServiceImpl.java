package com.naidiuk.consumernosql.service;

import com.naidiuk.consumernosql.entity.News;
import com.naidiuk.consumernosql.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    @Override
    public void save(News news) {
        newsRepository.save(news);
    }
}
