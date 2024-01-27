package com.amorim.teststoom.services;

import com.amorim.teststoom.domain.category.exceptions.CategoryNotFoundException;
import com.amorim.teststoom.domain.product.Product;
import com.amorim.teststoom.domain.product.ProductDTO;
import com.amorim.teststoom.domain.product.exceptions.ProductNotFoundException;
import com.amorim.teststoom.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final CategoryService categoryService;
    private final ProductRepository repository;
    private final BrandService brandService;

    public ProductService(CategoryService categoryService, ProductRepository productRepository, BrandService brandService){
        this.categoryService = categoryService;
        this.repository = productRepository;
        this.brandService = brandService;

    }

    public Product insert(ProductDTO productData){
        Product newProduct = new Product(productData);

        this.repository.save(newProduct);

         return newProduct;
    }

    public Product update(Long id, ProductDTO productData){
        Product product = this.repository.findById(id)
                .orElseThrow(ProductNotFoundException::new);

        if(!productData.title().isEmpty()) product.setTitle(productData.title());
        if(!productData.description().isEmpty()) product.setDescription(productData.description());
        if(!(productData.price() == null)) product.setPrice(productData.price());
        if(!(productData.categoryId() == null)) product.setCategory(String.valueOf(productData.categoryId()));
        if(!(productData.brandId() == null)) product.setBrand(String.valueOf(productData.brandId()));
        if(!(productData.status())) product.setStatus(false);

        this.repository.save(product);


        return product;
    }

    public void delete(Long id){
        Product product = this.repository.findById(id)
                .orElseThrow(ProductNotFoundException::new);
        product.setStatus(false);
        this.repository.save(product);
    }

    public List<Product> getAll(){

        return this.repository.findProductByStatusIsTrue();
    }
    public Optional<Product> getById(Long id){

        return this.repository.findById(id);
    }
}
