package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponseDto implements Serializable {

    public String errorMessage;
    public String errorCode;
}
