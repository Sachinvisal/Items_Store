package com.example.ItemProject.controler;

import com.example.ItemProject.dto.ItemCategeoryDTO;
import com.example.ItemProject.service.ItemCategeoryService;
import jakarta.websocket.server.ServerEndpoint;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/itemCategeory")
public class ItemCategeory {
      @Autowired
      private ItemCategeoryService itemCategeoryService;

      @GetMapping("/getItemCategeory")
      public List<ItemCategeoryDTO> getItemCategeory(){
            return  itemCategeoryService.getItemCategeoryAll();
      }

      @PostMapping("/addItemCategeory")
      public ItemCategeoryDTO addItemCategeory(@RequestBody ItemCategeoryDTO itemCategeoryDTO){
            return itemCategeoryService.addItemCategeory(itemCategeoryDTO);
      }

      @PutMapping("/updateItemCategeory/{id}")
      public ItemCategeoryDTO updateItemCategeory(@RequestBody ItemCategeoryDTO itemCategeoryDTO ,@PathVariable int id){
            try{
                  return itemCategeoryService.updateItemCategeory(itemCategeoryDTO,id);
            }catch(Exception e){
                  return null;
            }
      }

      @DeleteMapping("/deleteItemCategeory")
      public void deleteItemCategeory(@PathVariable int id){
            itemCategeoryService.deleteItemCategeory(id);
      }
}
