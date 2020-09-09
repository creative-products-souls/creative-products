package com.creative.solutions.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.creative.solutions.core.dto.ApplicationDto;
import com.creative.solutions.core.mapper.ApplicationMapper;
import com.creative.solutions.core.repository.ApplicationRepository;
import com.creative.solutions.core.util.SequenceIdGenerator;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    ApplicationRepository applicationRepository;

    @Autowired
    ApplicationMapper applicationMapper;

    @Override
    public ApplicationDto createapplication(ApplicationDto applicationDto) {


        ApplicationEntity appEntity = new ApplicationEntity();

        if(Objects.isNull(applicationDto.getAppId()) && applicationDto.getAppId() != 0)
            appEntity.setAppId(applicationDto.getAppId());

        appEntity.setAppName(applicationDto.getAppName());
        appEntity.setAppType(applicationDto.getAppType() != null ? applicationDto.getAppType() : "");
        appEntity.setCreatedby(applicationDto.getUserName());


        appEntity = applicationRepository.save(appEntity);
        applicationDto.setAppId(appEntity.getAppId());
        return applicationDto;
    }

    @Override
    public List<ApplicationEntity> getapplicationList(ApplicationDto applicationDto) {
        List<ApplicationEntity> applicationList = new ArrayList<ApplicationEntity>();

        if(Objects.isNull(applicationDto.getAppId()) && applicationDto.getAppId() != 0) {
            ApplicationEntity appEntity = applicationRepository.getOne(applicationDto.getAppId());
            applicationList.add(appEntity);
        }else {
            applicationList = (applicationRepository.findAll());
        }

        return applicationList;

    }
}