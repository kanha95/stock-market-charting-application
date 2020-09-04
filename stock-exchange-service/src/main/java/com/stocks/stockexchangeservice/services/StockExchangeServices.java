package com.stocks.stockexchangeservice.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocks.stockexchangeservice.models.StockExchange;
import com.stocks.stockexchangeservice.repository.StockExchangeRepository;




@Service
public class StockExchangeServices {
	
	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	public List<StockExchange> getAllStockExchange()
	{
		List<StockExchange> stockExchanges = stockExchangeRepository.findAll();
		return stockExchanges;
	}
    
    
	public Optional<StockExchange> getStockExchange(int id)
	{
		Optional<StockExchange> stockExchange = stockExchangeRepository.findById(id);
		return stockExchange;
	}
	
	
	public  StockExchange saveStockExchange(StockExchange s)

	{
		StockExchange stockExchange = stockExchangeRepository.save(s);
		return stockExchange;
	}
	
	
	public StockExchange updateStockExchange(StockExchange s)

	{
		StockExchange stockExchange = stockExchangeRepository.save(s);
		return stockExchange;
	}
	
	
	public String deleteStockExchange(int id)

	{
		Optional<StockExchange> s = stockExchangeRepository.findById(id);
		
		if(s!=null)
			{
			stockExchangeRepository.deleteById(id);
			return "Deleted stock exchange with id "+ id + ".";
			}
		else
			return "Invalid stock exchange id.";
	}
    
    
}
