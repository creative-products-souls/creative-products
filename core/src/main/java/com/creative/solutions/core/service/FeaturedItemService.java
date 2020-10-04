package com.creative.solutions.core.service;

import com.creative.solutions.core.dto.FeaturedItemDto;
import com.creative.solutions.core.dto.ProductDto;

import java.util.List;

public interface FeaturedItemService {

    List<ProductDto> createFeaturedList(FeaturedItemDto featuredItem);
}
