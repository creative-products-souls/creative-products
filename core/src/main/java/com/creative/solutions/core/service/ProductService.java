package com.creative.solutions.core.service;

import com.creative.solutions.core.dto.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto createProduct(ProductDto productDto);
    ProductDto getProductById(Long productId);
    List<ProductDto> getProductList();
    void deleteProduct(Long productId);
}
