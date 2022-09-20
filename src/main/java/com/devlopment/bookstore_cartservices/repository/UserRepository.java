package com.devlopment.bookstore_cartservices.repository;

import com.devlopment.bookstore_cartservices.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData,Integer> {
}
