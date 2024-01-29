package com.projects.EComProductService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "ecom_order")
public class Order extends BaseModel{
    private double amount;
    @ManyToMany
    private List<Product> productList;
}
