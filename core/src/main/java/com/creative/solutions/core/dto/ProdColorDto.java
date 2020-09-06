package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdColorDto extends BaseProductAtrributeDto implements Serializable {

    private long colorId;
    private String color;
}
