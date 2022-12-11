package com.ictak.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class AdminEvents {
WebDriver driver;
	
	
    @FindBy(xpath="//a[@routerlink=\"/adminpage/events\"]")
	private WebElement eventMenu;
	public AdminEvents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	  public void clickEvent()
	    {
		  WebElement l=driver.findElement(By.xpath("//a[@routerlink=\"/adminpage/events\"]"));
	      // Actions class with moveToElement()
	      Actions a = new Actions(driver);
	      a.moveToElement(l);
	      a.perform();
		  eventMenu.click();
	    }

}
