package com.example.ItemProject.controler;

import com.example.ItemProject.service.ItemCategeoryService;
import jakarta.websocket.server.ServerEndpoint;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/itemCategeory")
public class ItemCategeory {
//    @Autowired
//    private ItemCategeoryService itemCategeoryService;
}
