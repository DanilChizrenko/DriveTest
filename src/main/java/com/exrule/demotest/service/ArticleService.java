package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ArticleDto;
import com.exrule.demotest.model.Article;

import java.util.List;

public interface ArticleService {
    Article addArticle(ArticleDto articleDto) throws Exception;
    Article updateArticle(Long id,ArticleDto articleDto) throws Exception;
    void delete(Long id);
    List<Article> getAllArticles() throws Exception;
    Article getArticleById(Long id) throws Exception;
    List<Article> getArticlesForCategory(Long categoryId) throws Exception;
    List<Article> findByTitleContaining(String keyword) throws Exception;
    List<Article> findByAuthor(String author) throws Exception;
}
