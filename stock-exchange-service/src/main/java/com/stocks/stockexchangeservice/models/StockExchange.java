package com.stocks.stockexchangeservice.models;

public class StockExchange {
	private int id;
	private String brief;
	private String remarks;
	private int contactId;
	
	
	public StockExchange() {
	
	}
	
	public StockExchange(int id, String brief, String remarks, int contactId) {
		super();
		this.id = id;
		this.brief = brief;
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	
	@Override
	public String toString() {
		return "Sector [id=" + id + "brief=" + brief + "]";
	}
	
}
