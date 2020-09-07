package com.stocks.excelservice.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;


import com.stocks.excelservice.models.StockPrice;
import com.stocks.excelservice.repository.StockPriceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Service
public class ExcelService{

    @Autowired
    private StockPriceRepository stockpriceRepository;
    

    public void importExcelFile(InputStream inputStream) throws IOException{
        XSSFWorkbook book = new XSSFWorkbook(inputStream);
        Sheet initialSheet = book.getSheetAt(0);

        Iterator<Row> iterator = initialSheet.iterator();
        iterator.next();

        while(iterator.hasNext()){
            Iterator<Cell> items = iterator.next().cellIterator();
            StockPrice stockPrice= new StockPrice();
            stockPrice.setCompanyName(items.next().getStringCellValue());
            stockPrice.setStockExchangeName(items.next().getStringCellValue());
            stockPrice.setDay(items.next().getDateCellValue());
            stockPrice.setOpenPrice(items.next().getNumericCellValue());
            stockPrice.setClosePrice(items.next().getNumericCellValue());
            stockpriceRepository.save(stockPrice);
            
        }
        book.close();
    }
    
    public List<StockPrice> getAllStockprice() {
		return (List<StockPrice>) stockpriceRepository.findAll();
	}
    
//    public List<StockPrice> getbyCompanyNameandType(String Cname, String Day)
//    {
//    	return stockpriceRepository.getbyCompanyNameandType(Cname,Day);
//	}
    
 
}

    

   