package com.example.ItemProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String itemName;
    private String itemDescription;
    private int itemPrice;

    @ManyToOne
    @JoinColumn(name = "ItemCategeoryID")
    private  ItemCategeoryModel itemCategeory;

    @OneToOne
    @JoinColumn(name = "stockid")
    private StockModel stock;

}
