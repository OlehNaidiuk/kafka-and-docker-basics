package com.naidiuk.consumersql.service;

import com.naidiuk.consumersql.entity.News;
import com.naidiuk.consumersql.repository.NewsRepository;
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
