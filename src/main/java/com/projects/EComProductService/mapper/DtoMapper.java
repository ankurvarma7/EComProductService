package com.projects.EComProductService.mapper;

import com.projects.EComProductService.dtos.FakeProductServiceRequestDto;
import com.projects.EComProductService.dtos.FakeProductServiceResponseDto;
import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.models.Product;

public class DtoMapper {
    public static FakeProductServiceRequestDto productServiceRequestDtoToFakeProductServiceRequestDto(ProductServiceRequestDto productServiceRequestDto){
        FakeProductServiceRequestDto fakeProductServiceRequestDto=new FakeProductServiceRequestDto();
        fakeProductServiceRequestDto.setCategory(productServiceRequestDto.getCategory());
        fakeProductServiceRequestDto.setTitle(productServiceRequestDto.getTitle());
        fakeProductServiceRequestDto.setPrice(productServiceRequestDto.getPrice());
        fakeProductServiceRequestDto.setDescription(productServiceRequestDto.getDescription());
        fakeProductServiceRequestDto.setImage(productServiceRequestDto.getImage());
        return fakeProductServiceRequestDto;
    }

    public static ProductServiceResponseDto fakeProductServiceResponseDtoToProductServiceResponseDto(FakeProductServiceResponseDto fakeProductServiceResponseDto){
        ProductServiceResponseDto productServiceResponseDto=new ProductServiceResponseDto();
        productServiceResponseDto.setId(fakeProductServiceResponseDto.getId());
        productServiceResponseDto.setTitle(fakeProductServiceResponseDto.getTitle());
        productServiceResponseDto.setPrice(fakeProductServiceResponseDto.getPrice());
        productServiceResponseDto.setImage(fakeProductServiceResponseDto.getImage());
        productServiceResponseDto.setCategory(fakeProductServiceResponseDto.getCategory());
        productServiceResponseDto.setDescription(fakeProductServiceResponseDto.getDescription());
        return productServiceResponseDto;
    }

    public static ProductServiceResponseDto productToProductServiceResponseDto(Product product){
        ProductServiceResponseDto productServiceResponseDto=new ProductServiceResponseDto();
        productServiceResponseDto.setId(product.getId());
        productServiceResponseDto.setCategory(product.getCategory().getDescription());
        productServiceResponseDto.setTitle(product.getTitle());
        productServiceResponseDto.setPrice(product.getPrice().getAmount());
        productServiceResponseDto.setImage(product.getImageUrl());
        productServiceResponseDto.setDescription(product.getDescription());
        return productServiceResponseDto;
    }
}
