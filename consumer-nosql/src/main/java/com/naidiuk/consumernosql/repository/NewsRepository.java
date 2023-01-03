package com.naidiuk.consumernosql.repository;

import com.naidiuk.consumernosql.entity.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<News, String> {
}
