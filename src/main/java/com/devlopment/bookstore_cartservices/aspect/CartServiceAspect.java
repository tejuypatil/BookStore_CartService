package com.devlopment.bookstore_cartservices.aspect;

import com.devlopment.bookstore_cartservices.dto.CartRequestDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CartServiceAspect {

    @Before(value = "execution(* com.devlopment.bookstore_cartservices.service.CartService.*(..)) && args(cartRequestDTO,token)")
    public void beforeAdvice(JoinPoint joinPoint, CartRequestDTO cartRequestDTO,String token) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating Cart with name - " + cartRequestDTO);
    }

    @After(value = "execution(* com.devlopment.bookstore_cartservices.service.CartService.*(..)) && args(cartRequestDTO,token)")
    public void afterAdvice(JoinPoint joinPoint, CartRequestDTO cartRequestDTO,String token) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Cart with name - " +  cartRequestDTO + " and id - " + token);
    }
}

