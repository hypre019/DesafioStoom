package com.amorim.teststoom.repositories;

import com.amorim.teststoom.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductByStatusIsTrue();

}
