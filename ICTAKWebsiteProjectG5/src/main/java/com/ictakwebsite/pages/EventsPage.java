package com.ictakwebsite.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage {
	
	WebDriver driver;
	@FindBy(xpath ="//a[@id='dropdownMenuDocs'][contains(text(),'Events ')]")
	private WebElement events;
	@FindBy(xpath="//span[@class='text-sm'][contains(text(),'Academic and industrial conclave')]")
	private WebElement icse;
	@FindBy(xpath = "//button[@type='button'][contains(text(), 'Apply Now ')]") 
	private WebElement applyNow;
	@FindBy(name="name")
	private WebElement name;
	@FindBy(xpath = "//*[@type='email']")
	private WebElement email;
	@FindBy(name = "phoneno")
	private WebElement phone;
	@FindBy(xpath = "//*[@type='submit'][contains(text(),'Register')]")
	private WebElement registerButton;
	
	public EventsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void mouseHoverEvents() {
		Actions act=new Actions(driver);
		act.moveToElement(events).build().perform();
		//events.click();
	}
	public void clickIcset() {
		icse.click();
	}
	public void applyNow() {
		applyNow.click();
	}
	public void setName(String strUserName) {
		name.sendKeys(strUserName);
	}
	public void setEmail(String strEmail) {
		
		email.sendKeys(strEmail);
	}
	public void setNumber(String PhNum) {
		phone.sendKeys(PhNum);
	}
	
public String ClickRegister() {
	
	registerButton.click();
	Alert alert=driver.switchTo().alert();
	String Actual=alert.getText();
	alert.accept();
	return Actual;
	
}

}
