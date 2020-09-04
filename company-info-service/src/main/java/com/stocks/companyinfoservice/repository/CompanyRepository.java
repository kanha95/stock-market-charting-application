package com.stocks.companyinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stocks.companyinfoservice.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {

}