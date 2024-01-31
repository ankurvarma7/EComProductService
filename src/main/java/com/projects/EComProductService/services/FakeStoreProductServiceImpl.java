package com.projects.EComProductService.services;

import com.projects.EComProductService.client.FakeStoreClient;
import com.projects.EComProductService.dtos.FakeProductServiceResponseDto;
import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import org.springframework.stereotype.Service;
import static com.projects.EComProductService.mapper.DtoMapper.fakeProductServiceResponseDtoToProductServiceResponseDto;
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
