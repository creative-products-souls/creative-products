package com.creative.solutions.core.dto;

import com.google.common.collect.Lists;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProductDetailsResponseDto extends BaseResponseDto implements Serializable {

    public List<ProductDetailsDto> productList = Lists.newArrayList();
}
