package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApplicationDto extends BaseProductAtrributeDto implements Serializable {

    private long appId;
    private String appName;
    private String appType;
    private boolean isActive;
}
