package com.ictakwebsite.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CourseRegPage {
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Course Registration']")
	private WebElement coursereg;
	@FindBy(xpath="//button[contains(text(), 'Download')]")
	private WebElement download;
	public CourseRegPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickCourseReg() {
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
	    //WebElement courseregn = wait1.until(ExpectedConditions.visibilityOf(coursereg));
		//WebElement courseregn=wait.until(ExpectedConditions.elementToBeClickable(coursereg);
	//Actions action=new Actions(driver);
	   // action.moveToElement(courseregn).click().perform();
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(70));
	     WebElement courseReg= wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Course Registration']")));
	     Actions action=new Actions(driver);
	     action.moveToElement(courseReg).click().perform();     
		
	}
	public void clickDownload() {
		download.click();
	}	
	
}
