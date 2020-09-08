package com.stocks.excelservice.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.excelservice.models.StockPrice;
import org.springframework.data.jpa.repository.Query;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
 //public List<StockPrice> getbyCompanyNameandType(String Cname, String type);

 @Query(value = "SELECT * FROM StockPrice s WHERE s.CompanyName = ?1 LIMIT 10", nativeQuery = true);
 List<StockPrice> findByCompanyStocks(String companyName);
 

}
