package com.stocks.companyinfoservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.companyinfoservice.models.Ipo;

@RestController
public class IpoController {
	
	@Autowired
	IpoController service;
	
	@GetMapping("/ipo/all")
	public List<Ipo> getAllCompanyIPO()
	{
		List<Ipo> ipos=service.getAllCompanyIPO();
		return ipos;
	}
	@GetMapping("/ipo/{id}")
	public Optional<Ipo> getCompanyIPO(@PathVariable int id)

	{
		Optional<Ipo> CompanyIPO=service.getCompanyIPO(id);
		return CompanyIPO;
	}
	
	@PostMapping("/ipo")
	public  Ipo saveIPO(@RequestBody Ipo c)

	{
		Ipo CompanyIPO = service.saveIPO(c);
		return CompanyIPO;
	}
	
	@PutMapping("/ipo")
	public Ipo updateIPO(@RequestBody Ipo c)

	{
		Ipo CompanyIPO = service.updateIPO(c);
		return CompanyIPO;
	}
	
	@DeleteMapping("/ipo/{id}")
	public String deleteIPO(@PathVariable int id)

	{
		Optional<Ipo> c =service.getCompanyIPO(id);
		
		if(c!=null)
			{
			service.deleteIPO(id);
			return "Deleted CompanyIPO with id "+id ;
			}
		else
			return "Invalid CompanyIPO id";
	}


}