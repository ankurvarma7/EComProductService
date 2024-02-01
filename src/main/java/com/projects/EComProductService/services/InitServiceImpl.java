package com.projects.EComProductService.services;

import com.projects.EComProductService.models.Category;
import com.projects.EComProductService.models.Price;
import com.projects.EComProductService.models.Product;
import com.projects.EComProductService.repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitServiceImpl implements InitService{

    private CategoryRepo categoryRepo;

    public InitServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void initialize() {
        Category electronics=new Category();
        electronics.setDescription("electronics");

        Price iPhonePrice=new Price();
        iPhonePrice.setAmount(100000);
        iPhonePrice.setCurrency("INR");
        iPhonePrice.setDiscount(0);

        Price iPadPrice=new Price();
        iPadPrice.setAmount(150000);
        iPadPrice.setCurrency("INR");
        iPadPrice.setDiscount(0);

        Product iPhone=new Product();
        iPhone.setTitle("iPhone");
        iPhone.setDescription("Best phone ever!!");
        iPhone.setImageUrl("www.google.com/iPhone");
        iPhone.setPrice(iPhonePrice);

        Product iPad=new Product();
        iPad.setTitle("iPad");
        iPad.setDescription("Best tab ever!!");
        iPad.setImageUrl("www.google.com/iPad");
        iPad.setPrice(iPadPrice);

        electronics.setProductList(List.of(iPhone,iPad));

        electronics=categoryRepo.save(electronics);
    }
}
