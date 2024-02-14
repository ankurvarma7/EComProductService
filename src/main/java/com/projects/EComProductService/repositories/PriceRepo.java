package com.projects.EComProductService.repositories;

import com.projects.EComProductService.models.Price;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price,Integer> {
}
