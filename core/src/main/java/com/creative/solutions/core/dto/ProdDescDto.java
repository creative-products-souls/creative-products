package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdDescDto extends BaseProductAtrributeDto implements Serializable {

    private long descId;
    private String prodDesc;
    private String ageGrp;
}
