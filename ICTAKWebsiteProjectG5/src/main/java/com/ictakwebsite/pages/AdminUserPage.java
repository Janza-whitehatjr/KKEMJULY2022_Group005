package com.ictakwebsite.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminUserPage {
	WebDriver driver;
	@FindBy(xpath = "//a [@routerlink='/adminpage/admin-user']")
	private WebElement adminuser;
	@FindBy(xpath = "//a[contains(text(),'New Admin')]")
	private WebElement newadmin;
	@FindBy(xpath = ".//*[@name='usrname']")
	private WebElement username;
	@FindBy(xpath = "//input[@formcontrolname='Fname']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@formcontrolname='Lname']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@formcontrolname='designation']")
	private WebElement designation;
	@FindBy(xpath = "//input[@formcontrolname='pwd']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='superAdmin']")
	private WebElement accesscntl;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement addb;
	
	public AdminUserPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	public void clickAdminUser() {
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
		//wait.until(ExpectedConditions.elementToBeClickable(adminuser));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
		WebElement aduser=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@routerlink='/adminpage/admin-user']")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", aduser);
		
	}

	public void clickNewAdmin() {
		newadmin.click();

	}
	public void setUserName(String StrUserName) {
		username.sendKeys(StrUserName);

	}
	public void setFirstName(String StrFirstName) {

		firstname.sendKeys(StrFirstName);

	}

	public void setLastName(String StrLastName) {

		lastname.sendKeys(StrLastName);

	}
	public void setEmail(String StrEmail) {

		email.sendKeys(StrEmail);

	}

	public void setDes(String StrDes) {

		designation.sendKeys(StrDes);

	}
	public void setPasswd(String StrPasswd) {

		password.sendKeys(StrPasswd);

	}
	public void clickAccess() {

		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", accesscntl);

	}
	public void clickAdd() {

		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", addb);
		 
		 

	}
	

}
