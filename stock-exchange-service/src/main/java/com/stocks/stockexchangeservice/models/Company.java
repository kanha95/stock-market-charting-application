package com.stocks.stockexchangeservice.models;

public class Company {
	private int id;
	private String name;
	private String ceo;
    private String brief;
    private String code;
    private int contactId;
    private String sectorId;
    private String stockExchangeId;
	public Company() {
		super();
	}
	public Company(int id, String name, String ceo, String brief, String code, int contactId, String sectorId,
			String stockExchangeId) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.brief = brief;
		this.code = code;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
