package com.amorim.teststoom.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private String brand;
    private Integer price;
    private String category;
    private boolean status;

    public Product(ProductDTO data){
        this.title = data.title();
        this.description = data.description();
        this.brand = String.valueOf(data.brandId());
        this.price = data.price();
        this.category = String.valueOf(data.categoryId());
        this.status = data.status();
    }

}
