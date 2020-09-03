package com.stocks.sectorinfoservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.stocks.sectorinfoservice.models.Sector;

public interface SectorRepository extends CrudRepository<Sector, String> {

}
