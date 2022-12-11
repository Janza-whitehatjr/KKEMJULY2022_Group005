package com.group5.excelutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelUtility {
	private static XSSFWorkbook excelWBook;
	 private static XSSFSheet excelWsheet;
	 
	 
	 public static String getCellData(int RowNum,int ColNum) throws IOException
	 {
		 FileInputStream ExcelFile = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\group5\\src\\main\\resources\\testdata.xlsx");
		 excelWBook=new XSSFWorkbook(ExcelFile);
		 excelWsheet = excelWBook.getSheetAt(0);
		 return excelWsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	 }
//	 public static String getCellData1(int RowNum,int ColNum) throws IOException
//	 {
//		 FileInputStream ExcelFile = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\group5\\src\\main\\resources\\testdata.xlsx");
//		 excelWBook=new XSSFWorkbook(ExcelFile);
//		 excelWsheet = excelWBook.getSheetAt(1);
//		 return excelWsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
//	 }
	 public static String getCellData(String sheetName,int RowNum, int ColNum) throws IOException {
	        
	   	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("C:\\Users\\user\\eclipse-workspace\\group5\\src\\main\\resources\\testdata.xlsx"));
	   	 excelWBook = new XSSFWorkbook(ExcelFile);
	        excelWsheet = excelWBook.getSheet(sheetName);
	        return excelWsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	    }    
}
