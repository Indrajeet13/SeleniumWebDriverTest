package UilityFilesActions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int getRowCount(String xlfile, String xlsheet) throws IOException
	{
		fi = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(xlsheet);
		int rowcount =sheet.getLastRowNum();
		
		workbook.close();
		fi.close();
		return rowcount;
	
	}
	
	public static String getCellData(String xlfile, String xlsheet, int rownum, int cellnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		
		String data;
		try
		{
			//data = cell.toString();
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);	//Return the formatted value of cell as String regardless of cell type
			
		}
		catch(Exception e)
		{
			data = "";
		}
		
		workbook.close();
		fi.close();
		return data;	
	}
	
	public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException
	{
		fi = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		
		fo = new FileOutputStream(xlfile);
		workbook.write(fo);
		
		workbook.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		
	}
	
	
	
	

}
