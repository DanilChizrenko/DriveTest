package com.exrule.demotest.repository;

import com.exrule.demotest.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
