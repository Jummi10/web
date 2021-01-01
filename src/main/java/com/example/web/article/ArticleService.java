package com.example.web.article;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleResponse create(ArticleCreateRequest request) {
        Article article = request.toEntity();
        Article saved = articleRepository.save(article.create());
        return ArticleResponse.of(saved);
    }
}
