package com.devlopment.bookstore_cartservices.service;

import com.devlopment.bookstore_cartservices.dto.CartRequestDTO;
import com.devlopment.bookstore_cartservices.entity.Cart;
import com.devlopment.bookstore_cartservices.entity.UserData;
import com.devlopment.bookstore_cartservices.exception.InvalidTokenException;
import com.devlopment.bookstore_cartservices.repository.CartRepository;
import com.devlopment.bookstore_cartservices.util.TokenUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartService implements ICartService {
    @Autowired
    private CartRepository cartRepository;
    @Override
    public Cart createCart(CartRequestDTO cartRequestDTO) {
        /*int userId= tokenUtility.decodeToken(token);
        Optional<UserData> optionalUserData = userRepository.findById(userId);
        if(optionalUserData.isPresent())
        {*/
            Cart cart =new Cart();
            //UserData loggedInUserData = optionalUserData.get();
           // cart.setUserData(loggedInUserData);
            return cartRepository.save(cart);
        /*}
        else {
            throw new InvalidTokenException(token);
        }*/
    }

    @Override
    public Cart getCart(int cartId) {
        /*int userId= tokenUtility.decodeToken(token);
        Optional<UserData> optionalUserData = userRepository.findById(userId);
        if(optionalUserData.isPresent())
        {*/
            return cartRepository.findById(cartId).get();
       /* }
        else {
            throw new InvalidTokenException(token);
        }*/
    }

    @Override
    public Cart updateCart(int cartId, CartRequestDTO cartRequestDTO) {
        /*int userId= tokenUtility.decodeToken(token);
        Optional<UserData> optionalUserData = userRepository.findById(userId);
        if(optionalUserData.isPresent())
        {*/
            Cart cart=cartRepository.getReferenceById(cartId);
            cart.setQuantity(cartRequestDTO.getQuantity());
            //cart.setBookIds(cartRequestDTO.getBookIds());
            return cartRepository.save(cart);
      /*  }
        else {
            throw new InvalidTokenException(token);
        }*/
    }

    @Override
    public void deleteCart(int cartId) {
        /*int userId= tokenUtility.decodeToken(token);
        Optional<UserData> optionalUserData = userRepository.findById(userId);
        if(optionalUserData.isPresent())
        {*/
            cartRepository.deleteById(cartId);
        /*}
        else {
            throw new InvalidTokenException(token);
        }*/
    }
}
