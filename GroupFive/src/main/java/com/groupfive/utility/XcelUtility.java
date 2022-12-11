package com.groupfive.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelUtility {
	private static XSSFWorkbook excelWBook;
	 private static XSSFSheet excelWsheet;
	 
	 public static String getCellValue(String SheetName, int RowNum1,int ColNum1) throws IOException
	 {
		 FileInputStream ExcelFile1 = new FileInputStream("/Users/arjun/git/GroupFive/src/main/resources/TestData.xlsx");
		 excelWBook=new XSSFWorkbook(ExcelFile1);
		 excelWsheet = excelWBook.getSheet(SheetName);
		 return excelWsheet.getRow(RowNum1).getCell(ColNum1).getStringCellValue();
	 }
}
//public static String getCellData(int RowNum,int ColNum) throws IOException
//{
//	 FileInputStream ExcelFile = new FileInputStream("/Users/arjun/git/REPO2/GroupFive/src/main/resources/TestData.xlsx");
//	 excelWBook=new XSSFWorkbook(ExcelFile);
//	 excelWsheet = excelWBook.getSheetAt(0);
//	 return excelWsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
//}















