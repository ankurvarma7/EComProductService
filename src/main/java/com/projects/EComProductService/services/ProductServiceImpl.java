package com.projects.EComProductService.services;

import com.projects.EComProductService.dtos.ProductServiceRequestDto;
import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.exceptions.ProductNotFoundException;
import com.projects.EComProductService.models.Category;
import com.projects.EComProductService.models.Price;
import com.projects.EComProductService.models.Product;
import com.projects.EComProductService.repositories.CategoryRepo;
import com.projects.EComProductService.repositories.ProductRepo;
import org.springframework.stereotype.Service;
import static com.projects.EComProductService.mapper.DtoMapper.productToProductServiceResponseDto;
import java.util.List;
import java.util.Optional;
import static com.projects.EComProductService.utils.ProductUtils.isNull;

@Service("prodServiceImpl")
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo1){
        productRepo=productRepo1;
    }
    @Override
    public ProductServiceResponseDto getProduct(int id) {
        Optional<Product> product=productRepo.findById(id);
        if(product.isEmpty()) {
            throw new ProductNotFoundException("Product not found!!");
        }
        return productToProductServiceResponseDto(product.get());
    }

    public ProductServiceResponseDto getProductByTitle(String title){
        Product product=productRepo.findByTitle(title);
        if(isNull(product)){
            throw new ProductNotFoundException("Product not found!!");
        }
        return productToProductServiceResponseDto(product);
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
    public ProductServiceResponseDto modifyProduct(int id,ProductServiceRequestDto productServiceRequestDto) {
        return null;
    }

}
