package com.ictak.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ictak.pages.Loginpages;
import com.ictak.utility.Excelutility;

public class EventAdminLogin extends EventBase{
	@Test
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
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
