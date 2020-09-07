import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import com.stocks.excelservice.models.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Service
public class ExcelService{

    @Autowired
    private RestTemplate restTemplate;
    

    public void importExcelFile(InputStream inputStream){
        XSSFWorkbook book = new XSSFWorkbook(inputStream);
        Sheet initialSheet = book.getSheetAt(0);

        Iterator<Row> iterator = initialSheet.iterator();
        iterator.next();

        while(iterator.hasNext()){
            Iterator<Cell> items = iterator.next().cellIterator();
            String companyName = items.next().getStringCellValue();
            String stockExchangeName = items.next().getStringCellValue();
            Date day = items.next().getDateCellValue();
            Double openPrice = items.next().getNumericCellValue();
            Double closePrice = items.next().getNumericCellValue();
            

            StockExchange stockExchange = findStockExchange(stockExchangeName);
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
    public StockExchange findStockExchange() {

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