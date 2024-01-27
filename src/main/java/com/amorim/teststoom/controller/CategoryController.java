package com.amorim.teststoom.controller;

import com.amorim.teststoom.domain.category.Category;
import com.amorim.teststoom.domain.category.CategoryDTO;
import com.amorim.teststoom.domain.product.Product;
import com.amorim.teststoom.domain.product.ProductDTO;
import com.amorim.teststoom.services.CategoryService;
import com.amorim.teststoom.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService service;

    public CategoryController(CategoryService service){

        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Category> insert(@RequestBody CategoryDTO categorydata){
        Category newCategory = this.service.insert(categorydata);
        return ResponseEntity.ok().body(newCategory);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        List<Category> category = this.service.getAll();
        return ResponseEntity.ok().body(category);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable("id") Long id, @RequestBody CategoryDTO categorydata){
        Category updatedCategory = this.service.update(id, categorydata);
        return ResponseEntity.ok().body(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Category> delete(@PathVariable("id") Long id){
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
