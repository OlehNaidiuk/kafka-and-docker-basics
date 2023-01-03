package com.naidiuk.consumersql.repository;

import com.naidiuk.consumersql.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
