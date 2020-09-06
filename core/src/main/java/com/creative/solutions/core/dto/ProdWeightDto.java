package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdWeightDto extends BaseProductAtrributeDto implements Serializable {

    private long weightId;
    private Integer weight;
    private String unit;
}
