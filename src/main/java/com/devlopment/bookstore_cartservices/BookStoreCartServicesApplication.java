package com.devlopment.bookstore_cartservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookStoreCartServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreCartServicesApplication.class, args);
    }

}
