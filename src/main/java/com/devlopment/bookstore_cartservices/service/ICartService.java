package com.devlopment.bookstore_cartservices.service;

import com.devlopment.bookstore_cartservices.dto.CartRequestDTO;
import com.devlopment.bookstore_cartservices.entity.Cart;

public interface ICartService  {
    Cart createCart(CartRequestDTO cartRequestDTO,String token);

    Cart getCart(int cartId,String token);

    Cart updateCart(int cartId, CartRequestDTO cartRequestDTO,String token);

    void deleteCart(int bookId,String token);
}

