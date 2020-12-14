package com.example.web.application;

import org.springframework.stereotype.Service;

import com.example.web.application.response.ArticleResponse;
import com.example.web.domain.ArticleRepository;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleResponse findById(Long id) {
        return ArticleResponse.of(articleRepository.findById(id));
    }
}
