package com.devlopment.bookstore_cartservices.service;

import com.devlopment.bookstore_cartservices.dto.CartRequestDTO;
import com.devlopment.bookstore_cartservices.dto.UserResponseDTO;
import com.devlopment.bookstore_cartservices.entity.Cart;
import com.devlopment.bookstore_cartservices.entity.UserData;
import com.devlopment.bookstore_cartservices.exception.InvalidTokenException;
import com.devlopment.bookstore_cartservices.repository.CartRepository;
import com.devlopment.bookstore_cartservices.util.TokenUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
@Service
public class CartService implements ICartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    TokenUtility tokenUtility;
    @Autowired
    RestTemplate restTemplate;
    @Override
    public Cart createCart(CartRequestDTO cartRequestDTO,String token) {
        int userId= tokenUtility.decodeToken(token);
        UserResponseDTO userResponseDTO= restTemplate.getForObject("http://localhost:8086/userservice/" + userId,UserResponseDTO.class);
        UserData userData = userResponseDTO.getUserData();
        if(userData!= null)
        {
            Cart cart =new Cart();
            UserData loggedInUserData = userResponseDTO.getUserData();
            cart.setUserId(loggedInUserData.getUserId());
            cart.setUserData(loggedInUserData);
            cart.setQuantity(cartRequestDTO.getQuantity());
            cart.setBookIds(cartRequestDTO.getBookIds());
            return cartRepository.save(cart);
        }
        else {
            throw new InvalidTokenException(token);
        }
    }

    @Override
    public Cart getCart(int cartId,String token) {
        int userId= tokenUtility.decodeToken(token);
        UserResponseDTO userResponseDTO= restTemplate.getForObject("http://localhost:8086/userservice/" + userId,UserResponseDTO.class);
        UserData userData = userResponseDTO.getUserData();
        if(userData!= null)
        {
            return cartRepository.findById(cartId).get();
        }
        else {
            throw new InvalidTokenException(token);
        }
    }

    @Override
    public Cart updateCart(int cartId, CartRequestDTO cartRequestDTO,String token) {
        int userId= tokenUtility.decodeToken(token);
        UserResponseDTO userResponseDTO= restTemplate.getForObject("http://localhost:8086/userservice/" + userId,UserResponseDTO.class);
        UserData userData = userResponseDTO.getUserData();
        if(userData!= null)
        {
            Cart cart=cartRepository.getReferenceById(cartId);
            cart.setQuantity(cartRequestDTO.getQuantity());
            cart.setBookIds(cartRequestDTO.getBookIds());
            return cartRepository.save(cart);
       }
        else {
            throw new InvalidTokenException(token);
        }
    }

    @Override
    public void deleteCart(int cartId,String token) {
        int userId= tokenUtility.decodeToken(token);
        UserResponseDTO userResponseDTO= restTemplate.getForObject("http://localhost:8086/userservice/" + userId,UserResponseDTO.class);
        UserData userData = userResponseDTO.getUserData();
        if(userData!= null)
        {
            cartRepository.deleteById(cartId);
        }
        else {
            throw new InvalidTokenException(token);
        }
    }

}
