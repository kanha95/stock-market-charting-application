import java.io.InputStream;
import java.util.Iterator;

import org.springframework.stereotype.Service;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Service
public class ExcelService{
    

    public void importExcelFile(InputStream inputStream){
        WorkBook book = new XSSFWorkbook(inputStream);
        Sheet intial_sheet = book.getSheetAt(0);

        Iterator<Row> iterator = initial_sheet.iterator();
        iterator.next();

        while(iterator.hasNext()){
            Iterator<Cell> items = rowIterator.next().cellIterator();
            String companyName = items.next().getStringCellValue();
            String stockExchangeName = items.next().getStringCellValue();
            Date day = items.next().getDateCellValue();
            Double openPrice = items.next().getNumericCellValue();
            Double closePrice = items.next().getNumericCellValue();
            

            StockExchange stockExchange = findorStockExchange(stockExchangeName);
            if (stockExchange == null){
                stockExchange = createStockExchange(stockExchangeName);
            }

            Company company = findCompany(companyName);

            if(companyCheck){
               company = createCompanyAddStockExchange(companyName,stockExchange);
            }

            createStockPrice(openPrice,closePrice,day,company,stockExchange);
            
        }

    }


    //need to connect with company database
    public Company findCompany(){

    }

    //need to connect with stockexchange database
    public StockExchange findorStockExchange() {

    }

    //need to connect with 
    public Company createCompanyAddStockExchange(){

    }

    //need to connect with company database
    public StockExchange createStockExchange(){

    }

    //need to connect with company database
    public Stock createStockPrice(){


    }
    
}