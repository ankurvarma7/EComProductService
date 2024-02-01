package com.projects.EComProductService.controllers;

import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/products")
    public ResponseEntity<List<ProductServiceResponseDto>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping("/products")
    public ResponseEntity<ProductServiceResponseDto> addProduct(ProductServiceRequestDto productServiceRequestDto){
        return ResponseEntity.ok(productService.addProduct(productServiceRequestDto));
    }
    @PatchMapping("/products/{id}")
    public ResponseEntity<ProductServiceResponseDto> modifyProduct(@PathVariable("id") int id,ProductServiceRequestDto productServiceRequestDto){
        return ResponseEntity.ok(productService.modifyProduct(id,productServiceRequestDto));
    }

}
