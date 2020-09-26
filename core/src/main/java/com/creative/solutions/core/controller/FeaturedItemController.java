package com.creative.solutions.core.controller;

import com.creative.solutions.core.dto.ProductDto;
import com.creative.solutions.core.dto.ProductResponseDto;
import com.creative.solutions.core.service.FeaturedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/featuredItem")
public class FeaturedItemController {

    @Autowired
    FeaturedItemService featuredItemService;

    @PutMapping("/createFeaturedList")
    public ResponseEntity<ProductResponseDto> createFeaturedList(@RequestBody List<ProductDto> productDtos) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.getProductList().addAll(featuredItemService.createFeaturedList(productDtos));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
