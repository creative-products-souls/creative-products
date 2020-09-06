package com.creative.solutions.core.controller;

import com.creative.solutions.core.dto.ProductDto;
import com.creative.solutions.core.dto.ProductResponseDto;
import com.creative.solutions.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;*/
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

//@CrossOrigin(origins = {"http://localhost:8762", "http://localhost:8763", "http://localhost:9001"})
@RestController
//@PreAuthorize("isAuthenticated()")
@RequestMapping("/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @PutMapping("/createProduct")
    public ResponseEntity<ProductResponseDto> createProduct(@RequestBody ProductDto productDto) {
        //input variable product dto (ProductEntity) + method level entitlements
        //return product dto
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.getProductList().add(productService.createProduct(productDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    //@RolesAllowed({"admin"})
    //@PreAuthorize("hasRole('admin')")
    //@Secured("ROLE_ADMIN")
    @GetMapping("/getProductList")
    public ResponseEntity<ProductResponseDto> getProductList() {
        //input variable request object + method level entitlements
        //return list of product dto
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.getProductList().addAll(productService.getProductList());
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<ProductResponseDto> deleteProduct(@PathVariable Long productId) {
        //input variable c dto + method level entitlements
        //make only inactive
        //return deleteProduct dto with success
        productService.deleteProduct(productId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    //method process exception
}
