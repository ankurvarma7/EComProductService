package com.projects.EComProductService.services;

import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("prodServiceImpl")
public class ProductServiceImpl implements ProductService{
    @Override
    public ProductServiceResponseDto getProduct(int id) {
        return null;
    }

    @Override
    public List<ProductServiceResponseDto> getAllProducts() {
        return null;
    }

    @Override
    public ProductServiceResponseDto addProduct(ProductServiceRequestDto productServiceRequestDto) {
        return null;
    }

    @Override
    public ProductServiceResponseDto modifyProduct(ProductServiceRequestDto productServiceRequestDto) {
        return null;
    }
}
