package com.naidiuk.consumernosql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("news")
public class News {
    @Id
    private String newsId;
    private String title;
    private String description;
}


