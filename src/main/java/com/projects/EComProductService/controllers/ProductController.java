package com.projects.EComProductService.controllers;

import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("fakeProdServiceImpl") ProductService productService1){
        productService=productService1;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductServiceResponseDto> getProduct(@PathVariable("id") int id){
        return ResponseEntity.ok(productService.getProduct(id));
    }


}
