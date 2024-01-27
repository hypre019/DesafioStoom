package com.amorim.teststoom.domain.product;

public record ProductDTO(String title, String description, Long brandId, Integer price, Long categoryId, Boolean status) {
}
