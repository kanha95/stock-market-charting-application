package com.stocks.excelservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.stocks.excelservice.models.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice, Integer> {
 //public List<StockPrice> findByCompanyNameandType(String Cname, String type);
}
