package com.example.ItemProject.repo;

import com.example.ItemProject.model.StockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<StockModel, Integer> {
}
