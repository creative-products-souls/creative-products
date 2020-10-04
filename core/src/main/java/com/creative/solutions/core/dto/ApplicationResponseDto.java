package com.creative.solutions.core.dto;

import java.util.List;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.collect.Lists;

import lombok.Data;

@Data
@JsonInclude(Include.NON_EMPTY)
public class ApplicationResponseDto extends BaseResponseDto {
	
	public List<ApplicationEntity> applicationList = Lists.newArrayList();
	public List<ApplicationDto> applicationDtoList = Lists.newArrayList();
    public String genericMessage;
}
