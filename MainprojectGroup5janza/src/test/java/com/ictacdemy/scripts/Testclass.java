package com.ictacdemy.scripts;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterSuite;

//import org.junit.Assert;
//import org.openqa.selenium.Alert;


//import java.io.IOException;

import org.testng.annotations.Test;

import com.ictacademy.base.Testbase;
import com.ictacademy.pages.Homepage;
import com.ictacademy.pages.Partnership;
import com.ictacademy.utilities.Excelutility;

public class Testclass extends Testbase {
	Homepage objlogin;
	Partnership objPartner;
	
	@Test
	public void formfill() throws IOException, InterruptedException {
		objPartner= new Partnership(driver);
		objPartner.clickmship();
		objPartner.clickptship();
		objPartner.clickRbutton();
		String Uname=Excelutility.getCellData(0, 2);
		String email=Excelutility.getCellData(1, 2);
		String mobnum=Excelutility.getCellData(2, 2);
		String firm=Excelutility.getCellData(3, 2);
		String address=Excelutility.getCellData(4, 2);
		String dist=Excelutility.getCellData(5, 2);
		String offspace=Excelutility.getCellData(6, 2);
		String employees=Excelutility.getCellData(7, 2);
		String report=Excelutility.getCellData(8, 2);
		String expects=Excelutility.getCellData(9, 2);
		String promoters=Excelutility.getCellData(9, 2);
		objPartner.fillname(Uname);
		objPartner.fillemail(email);
		objPartner.fillphnum(mobnum);
		objPartner.fillfirm(firm);
		objPartner.filladdress(address);
		objPartner.filldist(dist);
		objPartner.filloffspace(offspace);
		objPartner.fillemployees(employees);
		objPartner.fillreport(report);
		objPartner.fillexpects(expects);
		objPartner.fillpromoters(promoters);
		objPartner.clksendmsg();
		Alert alert= driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Assert.assertEquals("Registration Successfull", alertMessage);
		Thread.sleep(3000);
	    alert.accept();	
		
	}

	
	
	

}
