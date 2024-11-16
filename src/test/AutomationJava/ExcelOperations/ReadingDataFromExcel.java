package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File ---> Workbook ---> Sheet ---> Row ---> cell


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestAutomation.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); 	//XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of Rows : "+totalRows);
		
		System.out.println("Number of Cells : "+totalCells);
		
		
	}

}
