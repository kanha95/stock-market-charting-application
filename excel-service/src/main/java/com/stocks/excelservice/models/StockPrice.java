package com.stocks.excelservice.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockPrice {
private static int serialNo=0;

@Id
 private int id;
 private String CompanyName;
 private String StockExchangeName;
 private Date Day;
 private double OpenPrice;
 private double ClosePrice;
 public StockPrice() {
	 super();
	 serialNo++;
	 id=serialNo;
 }
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyName() {
	return CompanyName;
}
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public String getStockExchangeName() {
	return StockExchangeName;
}
public void setStockExchangeName(String stockExchangeName) {
	StockExchangeName = stockExchangeName;
}
public Date getDay() {
	return Day;
}
public void setDay(Date day) {
	Day = day;
}
public double getOpenPrice() {
	return OpenPrice;
}
public void setOpenPrice(double openPrice) {
	OpenPrice = openPrice;
}
public double getClosePrice() {
	return ClosePrice;
}
public void setClosePrice(double closePrice) {
	ClosePrice = closePrice;
}
 
 
}
