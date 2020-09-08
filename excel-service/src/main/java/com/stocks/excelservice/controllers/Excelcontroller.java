package com.stocks.excelservice.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PathVariable;

import com.stocks.excelservice.models.StockPrice;
import com.stocks.excelservice.services.ExcelService;

@RestController

public class Excelcontroller{

@Autowired
private ExcelService excelService;

//@RequestMapping("/stockprices/{Cname}/{type}")
//public List<StockPrice> getbyCompanyNameandType(@PathVariable String Cname ,@PathVariable String type ) {
//    return excelService.getbyCompanyNameandType(Cname, type);
//}

@RequestMapping("/stockprices/import")
public void importPrice() throws IOException
{
	 File initialFile = new File("src/main/resources/sample.xlsx");
	 InputStream targetStream = new FileInputStream(initialFile);
	excelService.importExcelFile(targetStream);
}

@RequestMapping("/stockprices/all")
public List<StockPrice> getAllStockprice()
{
	return excelService.getAllStockprice();
}


}