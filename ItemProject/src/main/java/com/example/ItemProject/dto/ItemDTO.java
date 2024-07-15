package com.example.ItemProject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private int itemPrice;
}
