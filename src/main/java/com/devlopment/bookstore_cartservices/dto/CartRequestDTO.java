package com.devlopment.bookstore_cartservices.dto;

import lombok.Data;

import java.util.List;
@Data
public class CartRequestDTO {
    private int quantity;
    private List<Integer> bookIds;
}
