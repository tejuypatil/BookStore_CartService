package com.devlopment.bookstore_cartservices.dto;

import com.devlopment.bookstore_cartservices.entity.Cart;

public class CartResponseDTO {
    public String message;
    public Cart cart;
    public CartResponseDTO(String message, Cart cart) {
        this.message = message;
        this.cart= cart;
    }
}
