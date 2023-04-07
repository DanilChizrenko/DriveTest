package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.CategoryDto;
import com.exrule.demotest.model.Category;
import com.exrule.demotest.repository.CategoryRepository;
import com.exrule.demotest.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category createCateegory(CategoryDto categoryDto) throws Exception {
        Category category = new Category();
        category.setName(categoryDto.getName());
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id,CategoryDto categoryDto) throws Exception {
        Category category = categoryRepository.findById(id).orElseThrow();
        if(id != null){
            category.setName(categoryDto.getName());
        }
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAllCategory() throws Exception {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) throws Exception {
        return categoryRepository.findById(id).orElseThrow();
    }
}
