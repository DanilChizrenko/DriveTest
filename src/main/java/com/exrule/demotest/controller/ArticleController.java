package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.ArticleDto;
import com.exrule.demotest.model.Article;
import com.exrule.demotest.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("api/article/addarticle")
    public ResponseEntity<?> addArticle(@RequestBody ArticleDto articleDto) throws Exception{
        String name = articleService.addArticle(articleDto).getTitle();
        return ResponseEntity.ok().body("Article create - " + name);
    }

    @PutMapping("api/article/update/{id}")
    public Article updateArticle(@PathVariable Long id,@RequestBody ArticleDto articleDto) throws Exception{
        return articleService.updateArticle(id,articleDto);
    }

    @DeleteMapping("api/article/delete/{id}")
    public ResponseEntity<?> deleteArticle(Long id){
        articleService.delete(id);
        return ResponseEntity.ok().body("Article del");
    }

    @GetMapping("api/article")
    public List<Article> getAllArticles() throws Exception{
        return articleService.getAllArticles();
    }
}
