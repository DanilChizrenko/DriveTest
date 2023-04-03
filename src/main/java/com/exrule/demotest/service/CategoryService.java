package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.CategoryDto;
import com.exrule.demotest.model.Category;

import java.util.List;

public interface CategoryService {
    Category getById(Long id) throws Exception;
    Category createCateegory(CategoryDto categoryDto) throws Exception;
    Category updateCategory(Long id,CategoryDto categoryDto) throws Exception;
    void deleteCategory(Long id);

}
