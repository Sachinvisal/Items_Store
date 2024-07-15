package com.example.ItemProject.controler;

import com.example.ItemProject.dto.ItemDTO;
import com.example.ItemProject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/ItemStock/Item")
public class Item {

    @Autowired
    private ItemService itemService;

    //SHOW
    @GetMapping("/getItem")
    public List<ItemDTO> getItem() {
        return itemService.getAllItem();
    }
}
