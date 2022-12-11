package com.ictak.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpages {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	
	
public Loginpages(WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}

public void setUserName(String strUserName)
{
	username.sendKeys(strUserName);
}

public void setPassword(String strPassword)
    {
	password.sendKeys(strPassword);
	
	}
public void clickLogin()
{
	login.click();
}
public void clickSubmit()
{
	submit.click();
}
public void viewDashboard()
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Dashboard']")));   
	String actualString = driver.findElement(By.xpath("//h4[text()='Dashboard']")).getText();
	//System.out.println(actualString);
	assertTrue(((String) actualString).contains("Dashboard"));
}
}
