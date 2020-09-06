package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdIngredientDto extends BaseProductAtrributeDto implements Serializable {

    private long ingradientId;
    private String material;
}
