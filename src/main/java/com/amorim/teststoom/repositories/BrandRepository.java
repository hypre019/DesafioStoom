package com.amorim.teststoom.repositories;

import com.amorim.teststoom.domain.brand.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    List<Brand> findBrandByStatusIsTrue();
}
