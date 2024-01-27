package com.amorim.teststoom.services;

import com.amorim.teststoom.domain.brand.Brand;
import com.amorim.teststoom.domain.category.Category;
import com.amorim.teststoom.domain.category.CategoryDTO;
import com.amorim.teststoom.repositories.CategoryRepository;
import org.springframework.stereotype.Service;
import com.amorim.teststoom.domain.category.exceptions.CategoryNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository repository;


    public CategoryService(CategoryRepository repository){
        this.repository = repository;

    }

    public Category insert(CategoryDTO categoryData){
        Category newCategory = new Category(categoryData);

        this.repository.save(newCategory);


        return newCategory;
    }

    public Category update(Long id, CategoryDTO categoryData){
        Category category = this.repository.findById(id)
                .orElseThrow(CategoryNotFoundException::new);

        if(!categoryData.title().isEmpty()) category.setTitle(categoryData.title());
        if(!categoryData.description().isEmpty()) category.setDescription(categoryData.description());


        this.repository.save(category);

        return category;
    }

    public void delete(Long id){
        Category category = this.repository.findById(id)
                .orElseThrow(CategoryNotFoundException::new);
        category.setStatus(false);
        this.repository.save(category);
    }

    public List<Category> getAll(){
        return this.repository.findCategoriesByStatusIsTrue();
    }

    public Optional<Category> getById(Long id){

        return this.repository.findById(id);
    }
}
