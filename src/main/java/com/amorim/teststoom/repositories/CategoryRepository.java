package com.amorim.teststoom.repositories;

import com.amorim.teststoom.domain.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findCategoriesByStatusIsTrue();
}
