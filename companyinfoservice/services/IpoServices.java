package com.stocks.companyinfoservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.stocks.companyinfoservice.models.Ipo;
import com.stocks.companyinfoservice.repository.IpoRepository;

@Service
public class IpoServices {
	
	@Autowired
	IpoRepository repo;
	
	@GetMapping("/ipo/all")
	public List<Ipo> getAllCompanyIPO()
	{
		List<Ipo> ipos=repo.findAll();
		return ipos;
	}
	@GetMapping("/ipo/{id}")
	public Optional<Ipo> getCompanyIPO(int id)

	{
		Optional<Ipo> CompanyIPO=repo.findById(id);
		return CompanyIPO;
	}
	
	@PostMapping("/ipo")
	public  Ipo saveIPO(Ipo c)

	{
		c.setId(0);
		Ipo CompanyIPO = repo.save(c);
		return CompanyIPO;
	}
	
	@PutMapping("/ipo")
	public Ipo updateIPO(Ipo c)

	{
		Ipo CompanyIPO = repo.save(c);
		return CompanyIPO;
	}
	
	@DeleteMapping("/ipo/{id}")
	public String deleteIPO(int id)

	{
		Optional<Ipo> c =repo.findById(id);
		
		if(c!=null)
			{
			repo.deleteById(id);
			return "Deleted CompanyIPO with id "+id ;
			}
		else
			return "Invalid CompanyIPO id";
	}


}