package com.creative.solutions.core.controller;

import com.creative.solutions.core.beans.ApplicationEntity;
import com.creative.solutions.core.dto.BaseProductAtrributeDto;
import com.creative.solutions.core.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8762", "http://localhost:8763", "http://localhost:9001"})
@RestController
public class ProductAttributeController {

    //@Autowired
    ProductAttributeService productAttributeService;

    @PostMapping("/addAttribute")
    public List<ApplicationEntity> addAttribute(BaseProductAtrributeDto atrributeDto) throws Exception{

        //input variable base product atrribute dto + method level entitlements

        switch (atrributeDto.getClass().getName()){
            case "ProdPurityDto.class":
                //process this dto for further mapping to entity and persist record
                break;
            case "ProdSizeDto.class":
                //process this dto for further mapping to entity and persist record
                break;
            case "ProdWeightDto.class":
                //process this dto for further mapping to entity and persist record
                break;

        }
        //return product dto linked wih product attributes
        return null;
    }

    @PostMapping("/getMasterAttribute")
    public List<ApplicationEntity> getMasterAttribute() throws Exception{

        //method level entitlements
        //return product attribute dto linked wih all product attributes
        return null;
    }
}
