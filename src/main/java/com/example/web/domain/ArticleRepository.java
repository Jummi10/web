package com.example.web.domain;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {
    private static final Map<Long, Article> articles = new HashMap<>();

    static {
        for (int i = 0; i < 50; i++) {
            articles.put((long)i, new Article(i + "번째 게시물", "안녕하세요! " + i + "번째 게시물 입니다!"));
        }
    }

    public Article findById(Long id) {
        return articles.get(id);
    }
}
