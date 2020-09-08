package com.stocks.excelservice.controllers;

import java.util.List;

import com.stocks.excelservice.models.StockPrice;
import com.stocks.excelservice.services.StockPriceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/stock")
public class StockPriceController {

    @Autowired
    private StockPriceService stockPriceService;

    @PostMapping("/get-stocks-company")
    public List<StockPrice> getStockByCompany(@RequestBody String companyName) {
        return stockPriceService.getStockPriceForCompany(companyName);
    }
    
}
