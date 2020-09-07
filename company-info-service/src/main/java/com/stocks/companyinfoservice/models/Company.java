package com.stocks.companyinfoservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	private int id;
	private String ceo;
    private String brief;
    private String code;
    private String name;
    private int contactId;
    private String sectorId;
    private String stockExchangeId;
	public Company() {
		super();
	}
	public Company(int id, String ceo, String brief, String code, String name, int contactId, String sectorId,
			String stockExchangeId) {
		super();
		this.id = id;
		this.ceo = ceo;
		this.brief = brief;
		this.code = code;
		this.name = name;
		this.contactId = contactId;
		this.sectorId = sectorId;
		this.stockExchangeId = stockExchangeId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getSectorId() {
		return sectorId;
	}
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	public String getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(String stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
    
   
}
