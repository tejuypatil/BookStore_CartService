package com.devlopment.bookstore_cartservices.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CartRequestDTO {
    private int quantity;
    private int bookIds;

}
