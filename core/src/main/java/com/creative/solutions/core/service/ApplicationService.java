package com.creative.solutions.core.service;

import java.util.List;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.creative.solutions.core.dto.ApplicationDto;

public interface ApplicationService {

    ApplicationDto createapplication(ApplicationDto applicationDto);

    List<ApplicationEntity> getapplicationList(ApplicationDto applicationDto);
}