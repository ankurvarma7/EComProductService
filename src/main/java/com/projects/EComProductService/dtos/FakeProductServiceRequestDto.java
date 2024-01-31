package com.projects.EComProductService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductServiceRequestDto {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
