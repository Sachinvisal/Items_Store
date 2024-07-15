package com.example.ItemProject.service;

import com.example.ItemProject.dto.ItemDTO;
import com.example.ItemProject.model.ItemModel;
import com.example.ItemProject.repo.ItemRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Transactional
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;


    @Autowired
    private ModelMapper modelMapper;

    public List<ItemDTO>  getAllItem(){
        List<ItemModel> itemList = itemRepo.findAll();
        return modelMapper.map(itemList,new TypeToken<List<ItemDTO>>(){}.getType());
    }
}
