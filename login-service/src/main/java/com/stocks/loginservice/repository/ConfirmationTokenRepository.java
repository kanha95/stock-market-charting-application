package com.stocks.loginservice.repository;

import java.util.Optional;

import com.stocks.loginservice.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {
    Optional<ConfirmationToken> findTokenByToken(String token);
    Optional<ConfirmationToken> findTokenByUser(User user);
    void deleteByUser(User user);
}
