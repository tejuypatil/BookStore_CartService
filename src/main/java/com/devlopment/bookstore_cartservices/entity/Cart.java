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
}

