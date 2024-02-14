package com.projects.EComProductService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private String description;
    private String imageUrl;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Price price;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Category category;
}
