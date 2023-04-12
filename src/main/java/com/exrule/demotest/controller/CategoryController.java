package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.CategoryDto;
import com.exrule.demotest.model.Category;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("api/category/create")
    public ResponseEntity<?> createCateegory(@RequestBody CategoryDto categoryDto) throws Exception{
        String name = categoryService.createCateegory(categoryDto).getName();
        return ResponseEntity.ok().body("Car create - " + name);
    }

    @PutMapping("api/category/update/{id}")
    public Category updateCategory(@PathVariable Long id,@RequestBody CategoryDto categoryDto) throws Exception{
        return categoryService.updateCategory(id,categoryDto);
    }

    @DeleteMapping("api/category/delete/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.ok().body("Category del");
    }

    @GetMapping("api/categories")
    public List<Category> getAll() throws Exception{
        return categoryService.getAllCategory();
    }

    @GetMapping("api/category/{id}")
    public Category getById(@PathVariable Long id) throws Exception{
        return categoryService.getById(id);
    }
}
