package com.stocks.excelservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.excelservice.models.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
 //public List<StockPrice> getbyCompanyNameandType(String Cname, String type);
}
