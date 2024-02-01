package com.projects.EComProductService.services;

import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.models.Category;
import com.projects.EComProductService.models.Price;
import com.projects.EComProductService.models.Product;
import com.projects.EComProductService.repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("prodServiceImpl")
public class ProductServiceImpl implements ProductService{


    @Override
    public ProductServiceResponseDto getProduct(int id) {
        return null;
    }

    @Override
    public List<ProductServiceResponseDto> getProducts() {
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
