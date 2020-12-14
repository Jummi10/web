package com.example.web.application.response;

import com.example.web.domain.Article;

public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static ArticleResponse of(Article article) {
        return new ArticleResponse(article.getTitle(), article.getContent());
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
