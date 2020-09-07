package com.stocks.loginservice.repository;

import java.util.Optional;

import com.stocks.loginservice.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer>{
    
    Optional<User> findByUserName(String userName);
    
}