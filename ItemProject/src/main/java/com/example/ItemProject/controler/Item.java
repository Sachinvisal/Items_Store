package com.example.ItemProject.controler;

import com.example.ItemProject.dto.ItemDTO;
import com.example.ItemProject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //CREATE
    @PostMapping("/addItem")
    public ItemDTO addItem(@RequestBody ItemDTO itemDTO){
        return itemService.addItem(itemDTO);
    }

    //UPDATE

    @PutMapping("/updateItem/{id}")
    public  ItemDTO updateItem(@RequestBody ItemDTO itemDTO ,@PathVariable int id){
        try {
            return itemService.updateItem(itemDTO,id);
        }catch (Exception e){
            return null;
        }
    }

    //DELETE
    @DeleteMapping("/deleteItem/{id}")
    public  void deleteItem(@PathVariable int id){
             itemService.deleteItem(id);

    }


}
