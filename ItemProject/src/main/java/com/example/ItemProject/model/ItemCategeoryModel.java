package com.example.ItemProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemCategeoryModel  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ItemCategeoryID;
    private String ItemCategeoryName;
    private String ItemCategeoryDescription;

    @OneToMany(mappedBy = "itemCategeory")
    private List<ItemModel>  itemModels;

}
