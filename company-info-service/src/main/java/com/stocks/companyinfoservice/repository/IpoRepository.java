package com.stocks.companyinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stocks.companyinfoservice.models.Ipo;

@Repository
public interface IpoRepository extends JpaRepository<Ipo,Integer> {

}
