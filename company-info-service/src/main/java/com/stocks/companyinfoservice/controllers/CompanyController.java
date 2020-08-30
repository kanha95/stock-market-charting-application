package com.stocks.companyinfoservice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.companyinfoservice.models.Company;
import com.stocks.companyinfoservice.models.Ipo;
import com.stocks.companyinfoservice.services.CompanyServices;
import com.stocks.companyinfoservice.services.IpoServices;

@RestController
public class CompanyController {


    @Autowired
    private CompanyServices companyServices;

    @Autowired
    private IpoServices ipoServices;

    @RequestMapping("/companies/{pattern}")
    public ArrayList<Company> getMatchingCompanies(@PathVariable String pattern){
        return companyServices.getMatchingCompanies(pattern);
    }

    @RequestMapping("/companies/{name}")
    public String getCompanyDetails(@PathVariable String name){
        return companyServices.getCompanyDetails(name);
    }

    @RequestMapping("/companies/ipo/{id}")
    public Ipo getCompanyIPODetails(@PathVariable int id){
        return ipoServices.getCompanyIPODetails(id);
    }

    
}