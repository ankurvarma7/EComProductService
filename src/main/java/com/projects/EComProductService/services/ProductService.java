package com.projects.EComProductService.services;

import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;

import java.util.List;

public interface ProductService {
    public ProductServiceResponseDto getProduct(int id);
    public List<ProductServiceResponseDto> getProducts();
    public ProductServiceResponseDto addProduct(ProductServiceRequestDto productServiceRequestDto);
    public ProductServiceResponseDto modifyProduct(ProductServiceRequestDto productServiceRequestDto);
}
