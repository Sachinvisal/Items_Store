package com.example.ItemProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ItemCategeoryDTO {

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ItemCategeoryDTOBuilder {
        private int id;
        private String name;
        private String description;
    }
}
