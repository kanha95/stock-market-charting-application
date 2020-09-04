package com.stocks.loginservice.entity;

import javax.persistence.*;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String ceo;
    private String brief;
    private String name;
    private int contactId;
    private int sectorId;
    private int stockExchangeId;

    public int getContactId() {
        return this.contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getSectorId() {
        return this.sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getStockExchangeId() {
        return this.stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
        this.stockExchangeId = stockExchangeId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}