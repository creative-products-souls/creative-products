package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdFragnanceDto extends BaseProductAtrributeDto implements Serializable {

    private long fragnanceId;
    private String fragnance;
}
