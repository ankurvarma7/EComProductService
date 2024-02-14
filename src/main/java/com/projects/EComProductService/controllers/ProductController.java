package com.projects.EComProductService.controllers;

import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.services.ProductService;
import com.projects.EComProductService.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;
    private ProductServiceImpl productServiceImpl;

    public ProductController(@Qualifier("prodServiceImpl") ProductService productService1,ProductServiceImpl productServiceImpl){
        productService=productService1;
        this.productServiceImpl=productServiceImpl;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductServiceResponseDto> getProduct(@PathVariable("id") int id){
        return ResponseEntity.ok(productService.getProduct(id));
    }
    @GetMapping("/products/title/{title}")
    public ResponseEntity<ProductServiceResponseDto> getProductByTitle(@PathVariable("title") String title){
        return ResponseEntity.ok(productServiceImpl.getProductByTitle(title));
    }
    @GetMapping("/products")
    public ResponseEntity<List<ProductServiceResponseDto>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping("/products")
    public ResponseEntity<ProductServiceResponseDto> addProduct(@RequestBody ProductServiceRequestDto productServiceRequestDto){
        return ResponseEntity.ok(productService.addProduct(productServiceRequestDto));
    }
    @PatchMapping("/products/{id}")
    public ResponseEntity<ProductServiceResponseDto> modifyProduct(@RequestBody ProductServiceRequestDto productServiceRequestDto,@PathVariable("id") int id){
        return ResponseEntity.ok(productService.modifyProduct(id,productServiceRequestDto));
    }

}
