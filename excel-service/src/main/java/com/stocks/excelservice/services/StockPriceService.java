package com.stocks.excelservice.services;

import java.util.List;

import com.stocks.excelservice.models.StockPrice;
import com.stocks.excelservice.repository.StockPriceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockPriceService {

    @Autowired
    private StockPriceRepository stockPriceRepo;

    public List<StockPrice> getStockPriceForCompany(String companyName) {
        return stockPriceRepo.findByCompanyStocks(companyName);
    }
    
}
