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

public class AdminStaffPage {
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Staffs']")
	private WebElement staffs;
	@FindBy(xpath = "//a[@routerlink='/adminpage/add-staffs']")
	private WebElement addstaff;;	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	@FindBy(xpath = "//select[@name='des']")
	private WebElement des;
	@FindBy(xpath="//textarea[@name='about']")
	private WebElement about;
	@FindBy(xpath="//input[@type='file']")
	private WebElement image;
	@FindBy(xpath = "//button[@title='Next']")
	private WebElement addstaffbutton;
	
	 public AdminStaffPage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);

		}
	    public void clickStaff() {
	    	
	    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
			WebElement staff=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Staffs']")));
			//wait.until(ExpectedConditions.stalenessOf(staffs));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", staff);
			
	    	
	    }
	    public void clickAddStaff() {
	    	addstaff.click();
	    }
	    public void setUserName( String strUserName) {
	    	name.sendKeys(strUserName);
	    }
	    public void setDes( String strDes) {
	    	des.sendKeys(strDes);
	    }
	    public void setAboutUS( String strAbout) {
	    	des.sendKeys(strAbout);
	    }
	    public void setfile(String strImage) {
	    	image.sendKeys(strImage);
	    }
	    public void clickadd() {
	    	addstaffbutton.click();
	    	driver.findElement(By.xpath("//button[text()='OK']")).click();
	    }
	    
	
	
	

}
