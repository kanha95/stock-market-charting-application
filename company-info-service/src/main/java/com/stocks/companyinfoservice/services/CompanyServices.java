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
	private CompanyRepository repo;

	public List<Company> getAllCompany()
	{
		return (List<Company>)repo.findAll();
	}
	public Optional<Company> getCompany(int id)

	{
		return repo.findById(id);
	}
	
	
	public  void saveCompany(Company c)

	{
		Company company = repo.save(c);
	}
	
	
	public void updateCompany(Company c)

	{
		repo.save(c);
	}
	

	public void deleteCompany(int id)

	{
			repo.deleteById(id);
	}


}