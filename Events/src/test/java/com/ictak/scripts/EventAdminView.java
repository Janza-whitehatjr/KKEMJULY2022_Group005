package com.ictak.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictak.pages.AdminEvents;
import com.ictak.pages.Loginpages;
import com.ictak.pages.Logoutpages;
import com.ictak.utility.Excelutility;

public class EventAdminView  extends EventBase{
	@BeforeMethod
	public void verifyLogin() throws IOException
	{
		Loginpages objLogin=new Loginpages(driver);
		objLogin.clickLogin();
		String username=Excelutility.getCellData("login",0, 0);
		String password=Excelutility.getCellData("login",0, 1);
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickSubmit();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Dashboard']")));   
		String actualString = driver.findElement(By.xpath("//h4[text()='Dashboard']")).getText();
		System.out.println(actualString);
		assertTrue(actualString.contains("Dashboard"));
	}
	@Test
	public void viewAdminEvents()
	{
        AdminEvents objAdmin=new AdminEvents(driver);
		objAdmin.clickEvent();
		String actualString = driver.findElement(By.xpath("//h4[text()='Events list']")).getText();
	  	System.out.println(actualString);
	  	assertTrue(actualString.contains("Events"));
	}
	@AfterMethod
	public void verifyLogOut()
	{
		Logoutpages objLogout=new Logoutpages(driver);
		objLogout.admin();
		objLogout.logout();
		String actualTitle="ICT Academy of Kerala";
		String expectedTitle=driver.getTitle();
		System.out.println(expectedTitle);
		Assert.assertEquals(actualTitle,expectedTitle);
		driver.close();
		
	}

}
