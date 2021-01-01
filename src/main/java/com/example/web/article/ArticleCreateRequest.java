package com.example.web.article;

import java.util.List;

public class ArticleCreateRequest {
    private String title;
    private String content;
    private String author;
    private List<String> tags;

    private ArticleCreateRequest() {
    }

    public ArticleCreateRequest(String title, String content, String author,
            List<String> tags) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.tags = tags;
    }

    public Article toEntity() {
        return new Article(null, title, content, author, tags, null);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }
}
