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

    @JsonIgnoreProperties({"applications","hibernateLazyInitializer"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private UserData userData;

    @JsonIgnoreProperties({"applications","hibernateLazyInitializer"})
    @ElementCollection
    @CollectionTable(name = "cart_book", joinColumns = @JoinColumn(name = "cart_id"))
    private List<Integer> bookIds;

    public Cart(CartRequestDTO cartRequestDTO)
    {
        this.quantity=cartRequestDTO.getQuantity();
        this.bookIds = cartRequestDTO.getBookIds();
    }

    public Cart() {

    }
}

