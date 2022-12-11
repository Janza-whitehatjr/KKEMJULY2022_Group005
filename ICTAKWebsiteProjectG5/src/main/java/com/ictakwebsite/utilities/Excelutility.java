package com.ictakwebsite.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	
	private static      XSSFWorkbook excelWBook; 
    private static      XSSFSheet    excelWSheet; 
   

    public static String getCellData1(int SheetNum,int RowNum, int ColNum) throws IOException {
       FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"  + "/testData.xlsx");
   	   excelWBook = new XSSFWorkbook(ExcelFile);
        excelWSheet = excelWBook.getSheetAt(SheetNum);
        return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
    }
    public static String getCellData(String sheetName,int RowNum, int ColNum) throws IOException {
        
   	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"  + "/testData.xlsx");
   	 excelWBook = new XSSFWorkbook(ExcelFile);
        excelWSheet = excelWBook.getSheet(sheetName);
        return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
    }    

    
}

