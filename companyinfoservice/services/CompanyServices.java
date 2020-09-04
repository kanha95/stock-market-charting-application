package com.stocks.companyinfoservice.services;



import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocks.companyinfoservice.models.*;
import com.stocks.companyinfoservice.repository.CompanyRepository;




@Service
public class CompanyServices {
	
	@Autowired
	CompanyRepository repo;

	public List<Company> getAllCompany()
	{
		List<Company> companies=repo.findAll();
		return companies;
	}

	public Optional<Company> getCompany(int id)

	{
		Optional<Company> company=repo.findById(id);
		return company;
	}
	
	
	public  Company saveCompany(Company c)

	{
		Company company = repo.save(c);
		return company;
	}
	
	
	public Company updateCompany(Company c)

	{
		Company company = repo.save(c);
		return company;
	}
	

	public void deleteCompany(int id)

	{
		
			repo.deleteById(id);
	}


}