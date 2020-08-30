package com.stocks.companyinfoservice.models;

import java.sql.Date;

public class Ipo {
    private int id;
    private Date closeDateTime;
    private Date openDateTime;
    private String remarks;
    private double sharePrice;
    private double totalShares; 
    private double companyId;

	public Ipo(int id, Date closeDateTime, Date openDateTIme, String remarks, double sharePrice, double totalShares, double companyId) {
		this.id = id;
		this.closeDateTime = closeDateTime;
		this.openDateTime = openDateTIme;
		this.remarks = remarks;
		this.sharePrice = sharePrice;
		this.totalShares = totalShares;
		this.companyId = companyId;
    }
	
	
	public int getId() {
		return this.id;
	}		

	public void setId(int id) {
		this.id = id;
	}

	public Date getCloseDateTime() {
		return this.closeDateTime;
	}

	public void setCloseDateTime(Date closeDateTime) {
		this.closeDateTime = closeDateTime;
	}

	public Date getOpenDateTIme() {
		return this.openDateTime;
	}

	public void setOpenDateTIme(Date openDateTIme) {
		this.openDateTime = openDateTIme;
	}

	public double getSharePrice() {
		return this.sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getTotalShares() {
		return this.totalShares;
	}

	public void setTotalShares(double totalShares) {
		this.totalShares = totalShares;
	}

	public double getCompanyID() {
		return this.companyId;
	}

	public void setCompanyID(double companyID) {
		this.companyId = companyID;
	}

	public Ipo(){
		
	}


    public Ipo getIPODetails(){
        return this;
    }
    

}
