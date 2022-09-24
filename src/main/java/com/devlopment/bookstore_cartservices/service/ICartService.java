package com.devlopment.bookstore_cartservices.service;

import com.devlopment.bookstore_cartservices.dto.CartRequestDTO;
import com.devlopment.bookstore_cartservices.entity.Cart;

public interface ICartService  {
    Cart createCart(CartRequestDTO cartRequestDTO);

    Cart getCart(int cartId);

    Cart updateCart(int cartId, CartRequestDTO cartRequestDTO);

    void deleteCart(int bookId);
}

