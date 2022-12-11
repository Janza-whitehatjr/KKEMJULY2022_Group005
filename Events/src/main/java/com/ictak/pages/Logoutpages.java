package com.ictak.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logoutpages {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(css=".sidenav-normal")
	private WebElement logout;
	
	public Logoutpages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	public void admin()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
	    Actions action=new Actions(driver);
	    action.moveToElement(admin).click().perform();
	    	
	}
	public void logout()
	{
		Actions action=new Actions(driver);
		action.moveToElement(logout).click().perform();
	}

}
