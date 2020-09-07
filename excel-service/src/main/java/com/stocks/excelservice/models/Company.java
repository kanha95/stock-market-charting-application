package com.stocks.excelservice.models;

public class Company {
	
	private int id;
	private String ceo;
    private String brief;
    private String code;
    private String name;
    private int contactId;
    private int sectorId;
    private int stockExchangeId;
    
    
    public Company(int id, String ceo, String brief, String code, String name, int contactId, int sectorId, int stockExchangeId) {
        this.id = id;
        this.ceo = ceo;
        this.brief = brief;
        this.code = code;
        this.name = name;
        this.contactId = contactId;
        this.sectorId = sectorId;
        this.stockExchangeId = stockExchangeId;
    }
    
    public int getCompanyId() {
        return id;
    }
    
    public String getCompanyCeo() {
    	return ceo;
    }
    
    public String getCompanyBrief() {
    	return brief;
    }
    
    public String getCompanyCode() {
    	return code;
    }
    
    public String getCompanyName() {
        return name;  
    }
    
    public int getContactId() {
    	return contactId;
    }

    public int getSectorid() {
    	return sectorId;
    }
    
    public int getStockExchangeId() {
    	return stockExchangeId;
    }
    
    public void setCompanyId(int id) {
        this.id = id;
    }
    
    public void setCompanyCeo(String ceo) {
    	this.ceo = ceo;
    }
    
    public void setCompanyBrief(String brief) {
    	this.brief = brief;
    }
    
    public void setCompanyCode(String code) {
    	this.code = code;
    }
    
    public void setCompanyName(String name) {
        this.name = name;  
    }
    
    public void setContactId(int contactId) {
    	this.contactId = contactId;
    }

    public void setSectorid(int sectorId) {
    	this.sectorId = sectorId;
    }
    
    public void setStockExchangeId(int stockExchangeId) {
    	this.stockExchangeId = stockExchangeId;
    }

    

    
}
