package com.devlopment.bookstore_cartservices.repository;

import com.devlopment.bookstore_cartservices.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
}
