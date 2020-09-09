package com.creative.solutions.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.creative.solutions.core.dto.ApplicationDto;
import com.creative.solutions.core.dto.ApplicationResponseDto;
import com.creative.solutions.core.service.ApplicationService;

@CrossOrigin(origins = {"http://localhost:8762", "http://localhost:8763", "http://localhost:9001"})
@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    //Create, Update Application
    //Get Application
    //Delete Application

    /*@GetMapping("/users")
    public List<ApplicationEntity> getAllUserDetails() throws Exception{
        return null; //userRepository.findAll();
    }*/

    @PutMapping("/createApplication")
    public ResponseEntity<ApplicationResponseDto> createApplication(@RequestBody ApplicationDto applicationDto) throws Exception{
        //input variable application dto + method level entitlements
        //return application dto
        ApplicationResponseDto responseDto = new ApplicationResponseDto();
        try{
            responseDto.getApplicationDtoList().add(applicationService.createapplication(applicationDto));
            responseDto.setGenericMessage("Application has been created successfully");
        }catch(Exception e) {
            e.printStackTrace();
            responseDto.setGenericMessage("Failed to create the application");
            responseDto.setErrorMessage(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @PostMapping("/getApplicationList")
    public ResponseEntity<ApplicationResponseDto> getApplicationList(@RequestBody ApplicationDto applicationDto) throws Exception{

        ApplicationResponseDto responseDto = new ApplicationResponseDto();
        try {
            responseDto.getApplicationList().addAll(applicationService.getapplicationList(applicationDto));
            responseDto.setGenericMessage("Application list retrieved successfully");
        }catch(Exception e){
            e.printStackTrace();
            responseDto.setGenericMessage("Failed to retrieve the application list");
            responseDto.setErrorMessage(e.getMessage());
        }
        return ResponseEntity.ok(responseDto);
    }

    @PostMapping("/deleteApplication")
    public List<ApplicationEntity> deleteApplication() throws Exception{
        //input variable application dto + method level entitlements
        //make only inactive
        //return application dto with success
        return null;
    }
}