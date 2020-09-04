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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.companyinfoservice.models.Company;

import com.stocks.companyinfoservice.services.CompanyServices;


@RestController
@RequestMapping("")
public class CompanyController {
	
	@Autowired
	CompanyServices service;
	
	@GetMapping("/company/all")
	public List<Company> getAllCompany()
	{
		List<Company> companies=service.getAllCompany();
		return companies;
	}
	@GetMapping("/company/{id}")
	public Optional<Company> getCompany(@PathVariable int id)

	{
		Optional<Company> company=service.getCompany(id);
		return company;
	}
	
	@PostMapping("/company")
	public  Company saveCompany(@RequestBody Company c)

	{
		Company company = service.saveCompany(c);
		return company;
	}
	
	@PutMapping("/company")
	public Company updateCompany(@RequestBody Company c)

	{
		Company company = service.updateCompany(c);
		return company;
	}
	
	@DeleteMapping("/company/{id}")
	public String deleteCompany(@PathVariable int id)

	{
		Optional<Company> c =service.getCompany(id);
		
		if(c!=null)
			{
			service.deleteCompany(id);
			return "Deleted company with id "+id ;
			}
		else
			return "Invalid company id";
	}

}