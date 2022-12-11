package com.group5.pages;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"navigation\"]/ul/li[7]/a")
	private WebElement login;
    @FindBy(css = "input[name='email'][placeholder='Enter Your Email']")
	private WebElement username;
    @FindBy(name="password")
   	private WebElement password;
    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement signin;
    public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);

	}
    public void clickLogin() {
    	System.out.println("Hello");
    	System.out.println(login);
    	System.out.println(username);
    	login.click();
    }
    public void setUserName( String strUserName) {
    
    	username.sendKeys(strUserName);
    }
    public void setPassword(String strPassword) {
    	password.sendKeys(strPassword);
    }
    public void clickSignin() {
    	signin.click();
    	driver.findElement(By.xpath("//button[text()='OK']")).click();
    }
    


}