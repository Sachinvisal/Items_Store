package com.example.ItemProject.repo;

import com.example.ItemProject.model.ItemCategeoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategeoryRepo extends JpaRepository<ItemCategeoryModel, Integer> {
}
