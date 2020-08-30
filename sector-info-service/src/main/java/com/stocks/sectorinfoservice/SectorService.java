package com.stocks.sectorinfoservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stocks.sectorinfoservice.models.Sector;


@Service
public class SectorService {
	
	private ArrayList<Sector> sectors = new ArrayList<Sector>(Arrays.asList(
			new Sector(1,"IT", "Provides IT services"),
			new Sector(2,"Automobiles","Builds automobiles"),
			new Sector(3,"Healthcare","Provides healthcare")
			)); 
	public List<Sector> getAllSectors()
	{
		return sectors;
	}
	public Sector getSector(int id)
	{
		for(Sector s:sectors)
		{
			if(s.getId() == id) return s;
		}
		return null;
	}
	public void addSector(Sector sector) {
		sectors.add(sector);
	}
	public void updateSector(Sector sector, int id) {
		for(int i=0;i<sectors.size();i++)
		{
			if(sectors.get(i).getId() == id)
				sectors.set(i, sector);
		}
	}
}