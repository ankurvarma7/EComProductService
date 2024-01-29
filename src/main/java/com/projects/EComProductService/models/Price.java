package com.projects.EComProductService.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Price extends BaseModel{
    private String currency;
    private double amount;
    private double discount;
}
