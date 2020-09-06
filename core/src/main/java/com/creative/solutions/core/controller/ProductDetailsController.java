package com.creative.solutions.core.controller;

import com.creative.solutions.core.dto.ProductDetailsDto;
import com.creative.solutions.core.dto.ProductDetailsResponseDto;
import com.creative.solutions.core.service.ProductDetailsService;
import lombok.extern.slf4j.Slf4j;
//import org.keycloak.KeycloakSecurityContext;
//import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*import org.springframework.security.access.prepost.PreAuthorize;*/
import org.springframework.web.bind.annotation.*;

@Slf4j
//@CrossOrigin(origins = {"http://localhost:8762", "http://localhost:8080", "http://localhost:8081"})
@RestController
@RequestMapping("/productDetails")
public class ProductDetailsController {

    /*@Autowired
    KeycloakSecurityContext securityContext;
    @Autowired
    AccessToken accessToken;*/

    @Autowired
    ProductDetailsService productDetailsService;

    //@CrossOrigin(origins = {"http://localhost:8762", "http://localhost:8080", "http://localhost:8081", "http://localhost:8763", "http://localhost:9001"})
    @PutMapping("/createProductDetails")
    public ResponseEntity<ProductDetailsResponseDto> createProductDetails(@RequestBody ProductDetailsDto productDtlDto) {
        //input variable product dto (ProductEntity) + method level entitlements
        //return product dto

        //log.info("AccessToken: " + securityContext.getTokenString());
        //log.info("User: {} / {}", accessToken.getPreferredUsername(), accessToken.getName());

        ProductDetailsResponseDto responseDto = new ProductDetailsResponseDto();
        responseDto.getProductList().add(productDetailsService.createProductDetails(productDtlDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    //@RolesAllowed({"admin"})
    //@PreAuthorize("hasRole('admin')")
    //@Secured("ROLE_ADMIN")
    @GetMapping("/getProductDetailsList")
    public ResponseEntity<ProductDetailsResponseDto> getProductDetailsList() {
        //input variable request object + method level entitlements
        //return list of product dto
        ProductDetailsResponseDto responseDto = new ProductDetailsResponseDto();
        responseDto.getProductList().addAll(productDetailsService.getProductDetailsList());
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/deleteProductDetails/{productDetailId}")
    public ResponseEntity<ProductDetailsResponseDto> deleteProductDetails(@PathVariable Long productDetailId) {
        //input variable c dto + method level entitlements
        //make only inactive
        //return deleteProduct dto with success
        productDetailsService.deleteProductDetails(productDetailId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
