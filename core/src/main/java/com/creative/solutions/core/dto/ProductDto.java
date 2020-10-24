package com.creative.solutions.core.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ProductDto extends BaseProductAtrributeDto implements Serializable {

    private long prodId;
    private long appId;
    private String prodCode;
    private String prodName;
    private String prodType;
    private String prodCategory;
    private boolean isActive;

    private String prodImagePath;
    private String prodDesc;

    private ProdColorDto prodColor;
    private ProdFragnanceDto prodFragrance;
    private ProdGenderDto prodGender;
    private ProdImageDto prodImage;
    private ProdIngredientDto prodIngredient;
    private ProdPackagingDto prodPackaging;
    private ProdPurityDto prodPurity;
    private ProdSizeDto prodSize;
    private ProdWeightDto prodWeight;
}
