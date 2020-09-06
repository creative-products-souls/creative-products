package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdPackagingDto extends BaseProductAtrributeDto implements Serializable {

    private long packagingId;
    private String packageType;
    private String packageSize;
    private String packageMaterial;
}
