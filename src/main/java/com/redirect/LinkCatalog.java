package com.redirect;

import java.util.List;

public class LinkCatalog {
    private String link;
    private List<String> articles;

    public String getLink() {
        return link;
    }

    public LinkCatalog setLink(String link) {
        this.link = link;
        return this;
    }

    public List<String> getArticles() {
        return articles;
    }

    public LinkCatalog setArticles(List<String> articles) {
        this.articles = articles;
        return this;
    }
}