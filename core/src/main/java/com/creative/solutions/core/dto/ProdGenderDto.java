package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdGenderDto extends BaseProductAtrributeDto implements Serializable {

    private long genderId;
    private String gender;
    private String ageGrp;
}
