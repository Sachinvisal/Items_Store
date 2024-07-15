package com.example.ItemProject.repo;

import com.example.ItemProject.model.StockModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StockRepo extends JpaRepository<StockModel, Integer> {
}
