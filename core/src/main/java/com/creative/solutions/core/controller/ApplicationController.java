package com.creative.solutions.core.controller;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.creative.solutions.core.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8762", "http://localhost:8763", "http://localhost:9001"})
@RestController
public class ApplicationController {

    //@Autowired
    ApplicationService applicationService;

    //Create, Update Application
    //Get Application
    //Delete Application

    /*@GetMapping("/users")
    public List<ApplicationEntity> getAllUserDetails() throws Exception{
        return null; //userRepository.findAll();
    }*/

    @PostMapping("/createApplication")
    public List<ApplicationEntity> createApplication() throws Exception{
        //input variable application dto + method level entitlements
        //return application dto
        return null;
    }

    @PostMapping("/getApplicationList")
    public List<ApplicationEntity> getApplicationList() throws Exception{
        //input variable user id and application id (non-mandatory) + method level entitlements
        //return list of application dto
        return null;
    }

    @PostMapping("/deleteApplication")
    public List<ApplicationEntity> deleteApplication() throws Exception{
        //input variable application dto + method level entitlements
        //make only inactive
        //return application dto with success
        return null;
    }
}
