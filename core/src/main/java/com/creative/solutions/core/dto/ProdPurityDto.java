package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdPurityDto extends BaseProductAtrributeDto implements Serializable {

    private long purityId;
    private String purity;
}
