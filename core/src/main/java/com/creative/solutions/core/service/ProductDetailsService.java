package com.creative.solutions.core.service;

import com.creative.solutions.core.dto.ProductDetailsDto;

import java.util.List;

public interface ProductDetailsService {

    ProductDetailsDto createProductDetails(ProductDetailsDto productDetailsDto);
    ProductDetailsDto getProductDetailsById(Long productDtlId);
    List<ProductDetailsDto> getProductDetailsList();
    void deleteProductDetails(Long productDtlId);
}
