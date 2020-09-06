package com.creative.solutions.core.dto;

import com.google.common.collect.Lists;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProductResponseDto implements Serializable {

    public List<ProductDto> productList = Lists.newArrayList();
    public String errorMessage;
    public String errorCode;
}
