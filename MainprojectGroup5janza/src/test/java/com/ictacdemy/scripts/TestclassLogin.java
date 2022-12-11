package com.ictacdemy.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ictacademy.base.Testbase;
import com.ictacademy.pages.Homepage;
import com.ictacademy.utilities.Excelutility;
//import com.ictacademy.utilities.Excelutility;

public class TestclassLogin extends Testbase{
	Homepage objLogin;
	@BeforeMethod
	public void verifyLogin() throws IOException {
		objLogin= new Homepage(driver);
		objLogin.clickLoginbtn();
		String username=Excelutility.getCellData(0, 0);
		String password=Excelutility.getCellData(0, 1);
		objLogin.setUname(username);
		objLogin.setPsw(password);
		objLogin.clicksubmit();
		
	}
	@Test
	
	public void verifyTestimony() throws IOException {
		objLogin= new Homepage(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@routerlink='/adminpage/testimony']")));

		objLogin.clktestimony();
		objLogin.clknewtest();
		String Tname=Excelutility.getCellData(0, 3);
		String Torg= Excelutility.getCellData(1, 3);
		String Ttest= Excelutility.getCellData(2, 3);
		objLogin.Tname(Tname);
		objLogin.Torg(Torg);
		objLogin.Ttest(Ttest);
		objLogin.Tselect();
		objLogin.addImage();
		String actualsuccess=objLogin.Taddtest();
		assertTrue(actualsuccess.contains("Successfully Added"));
		
		}
	

}

