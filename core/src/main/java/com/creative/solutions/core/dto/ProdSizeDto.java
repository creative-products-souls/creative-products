package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdSizeDto extends BaseProductAtrributeDto implements Serializable {

    private long sizeId;
    private String size;
}
