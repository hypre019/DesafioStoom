package com.amorim.teststoom.services;

import com.amorim.teststoom.domain.brand.Brand;
import com.amorim.teststoom.domain.brand.BrandDTO;
import com.amorim.teststoom.domain.category.exceptions.CategoryNotFoundException;
import com.amorim.teststoom.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BrandService {
    private final BrandRepository repository;

    public BrandService(BrandRepository repository) {
        this.repository = repository;
    }

    public Brand insert(BrandDTO brandData){
        Brand newbrand = new Brand(brandData);

        this.repository.save(newbrand );


        return newbrand;
    }

    public Brand update(Long id, BrandDTO brandData){
        Brand brand = this.repository.findById(id)
                .orElseThrow(CategoryNotFoundException::new);

        if(!brandData.title().isEmpty()) brand.setTitle(brandData.title());
        brand.setStatus(true);



        this.repository.save(brand);

        return brand;
    }

    public void delete(Long id){
        Brand brand = this.repository.findById(id)
                             .orElseThrow(() -> new RuntimeException("Product not found"));
        brand.setStatus(false);
        this.repository.save(brand);
    }

    public List<Brand> getAll(){

        return this.repository.findBrandByStatusIsTrue();
    }

    public Optional<Brand> getById(Long id){

        return this.repository.findById(id);
    }
}


