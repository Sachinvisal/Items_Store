package com.example.ItemProject.service;

import com.example.ItemProject.dto.ItemCategeoryDTO;
import com.example.ItemProject.model.ItemCategeoryModel;
import com.example.ItemProject.repo.ItemCategeoryRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class ItemCategeoryService {
    @Autowired
    private ItemCategeoryRepo itemCategeoryRepo;
    @Autowired
    private ModelMapper modelMapper;

    //SHOW PART
    public List<ItemCategeoryDTO> getItemCategeoryAll(){
        List<ItemCategeoryModel> itemCategeoryList = itemCategeoryRepo.findAll();
        return modelMapper.map(itemCategeoryList,new TypeToken<List<ItemCategeoryDTO>>(){}.getType());
    }

    //SAVE PART
    public ItemCategeoryDTO addItemCategeory(ItemCategeoryDTO itemCategeoryDTO){
        itemCategeoryRepo.save(modelMapper.map(itemCategeoryDTO,ItemCategeoryModel.class));
        return itemCategeoryDTO;
    }

    //UPDATE PART
    public ItemCategeoryDTO updateItemCategeory(ItemCategeoryDTO itemCategeoryDTO, int id) {
        try {
            if (itemCategeoryRepo.existsById(id)) {
                ItemCategeoryModel itemCategeoryModel = new ItemCategeoryModel();
                itemCategeoryModel.setItemCategeoryID(id);
                itemCategeoryModel.setItemCategeoryName(itemCategeoryDTO.getItemCategeoryName());
                itemCategeoryModel.setItemCategeoryDescription(itemCategeoryDTO.getItemCategeoryDescription());
                itemCategeoryRepo.save(itemCategeoryModel);
                return itemCategeoryDTO;

            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }

    }

    //DELETE
    public void deleteItemCategeory(int id){
        itemCategeoryRepo.existsById(id);
    }

}
