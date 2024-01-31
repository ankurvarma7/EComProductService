package com.projects.EComProductService.client;

import com.projects.EComProductService.dtos.FakeProductServiceResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FakeStoreClient {
    private RestTemplateBuilder restTemplateBuilder;
    private String fakeStoreApiUrl;
    private String fakeStoreProductPath;
    public FakeStoreClient(RestTemplateBuilder restTemplateBuilder1, @Value("${fakestore.api.url}") String fakeStoreApiUrl1,@Value("${fakestore.product.path}") String fakeStoreProductPath1){
        restTemplateBuilder=restTemplateBuilder1;
        fakeStoreApiUrl=fakeStoreApiUrl1;
        fakeStoreProductPath=fakeStoreProductPath1;
    }

    public FakeProductServiceResponseDto getProduct(int id){

        RestTemplate restTemplate=restTemplateBuilder.build();
        String url=fakeStoreApiUrl+fakeStoreProductPath+"/"+id;
        ResponseEntity<FakeProductServiceResponseDto> response=restTemplate.getForEntity(url, FakeProductServiceResponseDto.class);
        return response.getBody();
    }
}
