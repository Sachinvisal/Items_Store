package com.example.ItemProject.repo;

import com.example.ItemProject.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemModel, Integer> {
}
