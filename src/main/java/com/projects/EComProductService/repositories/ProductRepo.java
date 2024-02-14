package com.projects.EComProductService.repositories;

import com.projects.EComProductService.dtos.ProductServiceResponseDto;
import com.projects.EComProductService.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    public Product findByTitle(String title);
}
