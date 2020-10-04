package com.creative.solutions.core.controller;

import com.creative.solutions.core.dto.FeaturedItemDto;
import com.creative.solutions.core.dto.ProductResponseDto;
import com.creative.solutions.core.service.FeaturedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/featuredItem")
public class FeaturedItemController {

    @Autowired
    FeaturedItemService featuredItemService;

    @PutMapping("/createFeaturedList")
    public ResponseEntity<ProductResponseDto> createFeaturedList(@RequestBody FeaturedItemDto featuredItem) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.getProductList().addAll(featuredItemService.createFeaturedList(featuredItem));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
