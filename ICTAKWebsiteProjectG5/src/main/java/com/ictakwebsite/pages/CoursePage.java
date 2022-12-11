package com.ictakwebsite.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
	
	WebDriver driver;
	@FindBy(id = "dropdownMenuBlocks")
	private WebElement courses;
	@FindBy(xpath="//*[text()='FULL STACK']")
	private WebElement meanfullstack;
	@FindBy(xpath = " //button[contains(text(),'Apply Now')]")
	private WebElement applyNow;
	@FindBy(name = "name")
	private WebElement name;
	@FindBy(css  ="input[placeholder='Email']")
	private WebElement email;
	@FindBy(name="phoneno")
	 private WebElement phoneNumber;
	@FindBy(xpath = "//button[@type='submit'][contains(text(),'Register')]")
	private WebElement registerButton;
	
	public CoursePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void mouseOverCourses() {
		Actions act=new Actions(driver);
		act.moveToElement(courses).build().perform();
		
	}
	public void ClickMeanFullStack() {
		meanfullstack.click();
}
	public void applyNowClick() {
		applyNow.click();
		
	}
	
	public void setUsername(String strUserName) {
		name.sendKeys(strUserName);
		
	}
	
public void setEmail(String strEmail) {
	email.sendKeys(strEmail);
	
}
public void setPhoneNumber(String StrPhNum) {
	
	phoneNumber.sendKeys(StrPhNum);
	
}
public String clickRegister() {
	registerButton.click();
	
	Alert alert=driver.switchTo().alert();
	String Actualtext=alert.getText();
	alert.accept();
	return Actualtext;
}

}
