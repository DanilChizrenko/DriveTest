package com.exrule.demotest.repository;

import com.exrule.demotest.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAll();
    List<Article> getArticlesByCategory_Id(Long categoryId);
    List<Article> findAllByTitleContainingIgnoreCase(String keyword);
    List<Article> findAllByAuthorContainingIgnoreCase(String author);
}
