package com.stocks.sectorinfoservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocks.sectorinfoservice.models.Sector;
import com.stocks.sectorinfoservice.repository.SectorRepository;


@Service
public class SectorService {
	@Autowired
	private SectorRepository sectorRepository;
	

	
	public List<Sector> getAllSectors()
	{
		List<Sector> sectors = new ArrayList<Sector>();
		for(Sector s:sectorRepository.findAll())
			sectors.add(s);
		
		return sectors;
	}
	public Optional<Sector> getSector(String id)
	{
		return sectorRepository.findById(id);
	}
	public void addSector(Sector sector) {
		sectorRepository.save(sector);
	}
	public void updateSector(Sector sector, int id) {
		sectorRepository.save(sector);
	}
}