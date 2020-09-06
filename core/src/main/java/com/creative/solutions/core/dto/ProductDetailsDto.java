package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDetailsDto extends BaseProductAtrributeDto implements Serializable {

    private long prdtlId;
    private Long appId;
    private Long prodId;
    private Long colorId;
    private Long fragnanceId;
    private Long sizeId;
    private Long packagingId;
    private Long ingradientId;
    private Long purityId;
    private Long genderId;
    private Long descId;

    /*private String prodImagePath;
    private String prodName;
    private String prodDesc;
    private String prodNameAlign;
    private String prodReviewAlign;
    private String prodPricePos;
    private String prodPriceAlign;*/
}
