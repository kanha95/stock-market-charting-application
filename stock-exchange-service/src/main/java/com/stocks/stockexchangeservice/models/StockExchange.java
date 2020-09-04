package com.stocks.stockexchangeservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StockExchange {
	@Id
	private int id;
	private String name;
	private String remarks;
	private int contactId;
	

	public StockExchange() {
	
	}
	
	public StockExchange(int id, String name, String remarks, int contactId) {
		super();
		this.id = id;
		this.name = name;
		this.remarks = remarks;
		this.contactId = contactId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String brief) {
		this.name = brief;
	}
	
	
	@Override
	public String toString() {
		return "Sector [id=" + id + "brief=" + name + "]";
	}
	
}
