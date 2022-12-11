package com.ictakwebsite.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"dropdownMenuPages\"][contains(text(), 'Contact Us')]")
	private WebElement contactus;
	@FindBy(name = "name")
	private WebElement name;
	@FindBy(css = "input[placeholder='Email id']")
	private WebElement email;
	@FindBy(name="coursename")
	private WebElement coursename;
	@FindBy(id = "message")
	private WebElement message;
	@FindBy(xpath = "//button[contains(text(), 'Send Message')]")
	private WebElement sendbutton;
    
    public ContactUsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    public void clickContactus() {
    	contactus.click();
    }
    
    public void setName(String strUserName) {
    	name.sendKeys(strUserName);
    }
    public void setEmail(String strEmail) {
    	email.sendKeys(strEmail);
    }
    public void courseName(String strCourseName) {
    	coursename.sendKeys(strCourseName);
    }
    public void setMessage(String strMessage){
    	message.sendKeys(strMessage);
    	
    
    }
    
    public String clicksendMsg() throws InterruptedException  {
    	Thread.sleep(2000);
    	//sendbutton.submit();
    	sendbutton.sendKeys(Keys.ENTER);
    	Alert alert= driver.switchTo().alert();
    	String actual=alert.getText();
    	System.out.println(actual);
    	alert.accept();
    	return actual;

    	
    	
    	
    }
    

}
