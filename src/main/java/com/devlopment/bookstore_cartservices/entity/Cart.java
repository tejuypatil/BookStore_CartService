package com.devlopment.bookstore_cartservices.entity;

import com.devlopment.bookstore_cartservices.dto.CartRequestDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int cartId;
    private int quantity;
    private int userId;
    private int bookIds;
    public Cart() {

    }
    public void setUserData(UserData loggedInUserData) {
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookIds() {
        return bookIds;
    }

    public void setBookIds(int bookIds) {
        this.bookIds = bookIds;
    }
}

