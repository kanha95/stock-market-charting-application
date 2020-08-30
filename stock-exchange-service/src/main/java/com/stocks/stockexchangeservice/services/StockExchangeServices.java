package com.stocks.stockexchangeservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stocks.stockexchangeservice.models.StockExchange;

import java.util.Arrays;


@Service
public class StockExchangeServices {
	
	private ArrayList<StockExchange> stocks = new ArrayList<StockExchange>(Arrays.asList(
			new StockExchange(1,"IT", "Provides IT services", 1),
			new StockExchange(2,"Automobiles","Builds automobiles", 1),
			new StockExchange(3,"Healthcare","Provides healthcare", 1)
			)); 
	
    public List<StockExchange> getStockExchangeList(){
    	return stocks;
    }
    
    public void addStockExchange(StockExchange newstock) {
    	stocks.add(newstock);
    }
}
