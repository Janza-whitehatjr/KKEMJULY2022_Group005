package com.groupfive.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base{
//WebDriver driver; 
	

	@FindBy(xpath="//a[text()=\"Login\"]")
	private WebElement lg;
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement uname;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement psw;
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement submit;
	
	public LoginPage(WebDriver driver)
	{
		System.out.println(lg);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	public void clickLoginbtn() {
		lg.click();
	}
	public void setUname(String setUname) {
		uname.sendKeys(setUname);
		
	}
	public void setPsw(String setPsw) {
		psw.sendKeys(setPsw);
		
	}
     public void clicksubmit() { 	
		submit.click();		
	}
     public void clickpop() {
 		submit.click();
 		((WebElement) driver).sendKeys(Keys.ENTER);
 	}
}
