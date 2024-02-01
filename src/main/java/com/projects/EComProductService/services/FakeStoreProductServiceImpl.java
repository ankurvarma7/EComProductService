package com.projects.EComProductService.services;

import com.projects.EComProductService.client.FakeStoreClient;
import com.projects.EComProductService.dtos.FakeProductServiceRequestDto;
import com.projects.EComProductService.dtos.FakeProductServiceResponseDto;
import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import org.springframework.stereotype.Service;
import static com.projects.EComProductService.mapper.DtoMapper.fakeProductServiceResponseDtoToProductServiceResponseDto;
import static com.projects.EComProductService.mapper.DtoMapper.productServiceRequestDtoToFakeProductServiceRequestDto;

import java.util.ArrayList;
import java.util.List;

@Service("fakeProdServiceImpl")
public class FakeStoreProductServiceImpl implements ProductService{

    private FakeStoreClient fakeStoreClient;

    public FakeStoreProductServiceImpl(FakeStoreClient fakeStoreClient1){
        fakeStoreClient=fakeStoreClient1;
    }
    @Override
    public ProductServiceResponseDto getProduct(int id) {
        FakeProductServiceResponseDto fakeProductServiceResponseDto=fakeStoreClient.getProduct(id);
        return fakeProductServiceResponseDtoToProductServiceResponseDto(fakeProductServiceResponseDto);
    }

    @Override
    public List<ProductServiceResponseDto> getProducts() {
        List<FakeProductServiceResponseDto> fakeProductServiceResponseDtos=fakeStoreClient.getProducts();
        List<ProductServiceResponseDto> productServiceResponseDtos=new ArrayList<>();
        for(FakeProductServiceResponseDto fakeProductServiceResponseDto:fakeProductServiceResponseDtos){
            productServiceResponseDtos.add(fakeProductServiceResponseDtoToProductServiceResponseDto(fakeProductServiceResponseDto));
        }
        return productServiceResponseDtos;
    }

    @Override
    public ProductServiceResponseDto addProduct(ProductServiceRequestDto productServiceRequestDto) {
        FakeProductServiceRequestDto fakeProductServiceRequestDto=productServiceRequestDtoToFakeProductServiceRequestDto(productServiceRequestDto);
        ProductServiceResponseDto productServiceResponseDto=fakeProductServiceResponseDtoToProductServiceResponseDto(fakeStoreClient.addProduct(fakeProductServiceRequestDto));
        return productServiceResponseDto;
    }

    @Override
    public ProductServiceResponseDto modifyProduct(ProductServiceRequestDto productServiceRequestDto) {
        return null;
    }
}
