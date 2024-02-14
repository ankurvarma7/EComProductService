package com.projects.EComProductService.dtos;

import com.projects.EComProductService.models.Category;
import com.projects.EComProductService.models.Price;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductServiceResponseDto {
    private int id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
