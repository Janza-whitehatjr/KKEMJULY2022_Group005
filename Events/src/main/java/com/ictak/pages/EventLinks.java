package com.ictak.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventLinks extends Eventpages{
		
	
	@FindBy(xpath="//*[text()='About']")
	private WebElement about;
	
	@FindBy(xpath="//*[text()=' Objectives']")
	private WebElement objectives;
	
	@FindBy(xpath="//*[text()='Overview']")
	private WebElement overview;
	
	@FindBy(xpath="//a[text()='Agenda']")
	private WebElement agenda;
	
	@FindBy(xpath="//a[text()='Training']")
	private WebElement training;
	
	
	
	public EventLinks(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	public void clickAbout()
    {
		 about.click();
    }

	public void clickObjectives()
    {
	WebElement l=driver.findElement(By.xpath("//*[text()=' Objectives']"));
    // Actions class with moveToElement()
    Actions a = new Actions(driver);
    a.moveToElement(l);
    a.perform();
	objectives.click();
    }

	public void clickOverview()
    {
		WebElement l=driver.findElement(By.xpath("//*[text()='Overview']"));
	    // Actions class with moveToElement()
	    Actions a = new Actions(driver);
	    a.moveToElement(l);
	    a.perform();
		overview.click();
    }
	
	public void clickAgenda()
    {   
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement (By.xpath("//a[text()='Agenda']"));
		Point point = element.getLocation();
		int xcord = point.getX();
		int ycord = point.getY ();
		System.out.println(xcord + ", "+ycord);
		js.executeScript("window.scrollTo(" + xcord + "," + ycord + ");");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Agenda']")));
    	 agenda.click();
    	 
    }

	public void clickTraining()
    {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement (By.xpath("//a[text()='Training']"));
		Point point = element.getLocation();
		int xcord = point.getX();
		int ycord = point.getY ();
		System.out.println(xcord + ", "+ycord);
		js.executeScript("window.scrollTo(" + xcord + "," + ycord + ");");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Training']")));
    	 training.click();
			
    }
}
