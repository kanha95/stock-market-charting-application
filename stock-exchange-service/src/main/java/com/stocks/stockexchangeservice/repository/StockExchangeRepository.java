package com.stocks.stockexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stocks.stockexchangeservice.models.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
