package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdImageDto extends BaseProductAtrributeDto implements Serializable {

    private long imageId;
    private byte[] image;
    private String clarity;
}
