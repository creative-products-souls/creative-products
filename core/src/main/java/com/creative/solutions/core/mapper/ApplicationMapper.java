package com.creative.solutions.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.creative.solutions.core.dto.ApplicationDto;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
	
	ApplicationMapper INSTANCE = Mappers.getMapper(ApplicationMapper.class);

	    ApplicationDto toApplicationDto(ApplicationEntity appEntity);
	    List<ApplicationDto> toApplicationDtos(List<ApplicationEntity> applications);
	    ApplicationEntity toApplication(ApplicationDto applicationDto);
	    List<ApplicationEntity> toApplicationList(List<ApplicationDto> ApplicationDtos);

}
