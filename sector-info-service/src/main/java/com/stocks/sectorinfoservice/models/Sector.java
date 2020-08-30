package com.stocks.sectorinfoservice.models;

public class Sector {
	private int id;
	private String brief;
	private String name;
	
	public Sector() {
	}
	public Sector(int id, String brief, String name) {
		super();
		this.id=id;
		this.brief = brief;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setSector(String name) {
		this.name = name;
	}
	public String getBrief() {
		return brief;
	}
	public void setDesc(String brief) {
		this.brief = brief;
	}
	@Override
	public String toString() {
		return "Sector [id=" + id + ", sector=" + name + ", brief=" + brief + "]";
	}
}
