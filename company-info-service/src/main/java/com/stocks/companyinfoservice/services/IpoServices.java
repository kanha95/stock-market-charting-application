package com.stocks.companyinfoservice.services;

import java.util.ArrayList;

import com.stocks.companyinfoservice.models.Ipo;

public class IpoServices {
    private ArrayList<Ipo> ipoDatabase;

    public Ipo getCompanyIPODetails(int id){
        Ipo toReturn = new Ipo();
        for(Ipo ipo:ipoDatabase){
            if(ipo.getCompanyID() == id){
                toReturn =  ipo.getIPODetails();
                break;
            }
        }
        return toReturn;
    }

}
