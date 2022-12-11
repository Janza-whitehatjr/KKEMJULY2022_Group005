package com.ictacademy.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ictacademy.base.Testbase;

public class Homepage extends Testbase{
	//WebDriver driver;
	@FindBy(xpath="//a[@data-bs-target='#exampleModalForm']")
	private WebElement lg;
	@FindBy(xpath="//input[@placeholder='Enter Your Email']")
	private WebElement uname;
	@FindBy(xpath="//input[@name='password']")
	private WebElement psw;
	@FindBy(xpath="//button[text()=' Sign in ']")
	private WebElement submit;
	@FindBy(xpath="//a[@routerlink='/adminpage/testimony']")
	private WebElement testimony;
	@FindBy(xpath="//a[contains(., 'New')]")
	private WebElement newtestbtn;
	@FindBy(xpath="//input[@name='name' and @formcontrolname='name']")
	private WebElement tformname;
	@FindBy(xpath="//input[contains(@formcontrolname,'Org')]")
	private WebElement tformorg;
	@FindBy(xpath="//textarea[contains(@formcontrolname,'testi')]")
	private WebElement tformtest;
	@FindBy(xpath="//option[text()='Software Testing']")
	private WebElement selectcourse;
	@FindBy(xpath="//button[contains(@title,'Next')]")
	private WebElement addtest;
	@FindBy(xpath="//h2[text()='Successfully Added']")
	private WebElement successtestimony ;
	@FindBy(xpath="//button[text()='OK']")
	private WebElement successbtn ;
	@FindBy (xpath="//a[contains(@routerlink,'/adminpage/partnership')]")
	private WebElement partnershipadmin;
	@FindBy(xpath="//button[contains(@style, 'cursor: pointer;')]")
	private WebElement ptrdwnloadbtn;
	@FindBy(xpath="//a[contains(@routerlink,'/adminpage/corporate')]")
	private WebElement corporateadmin;
	@FindBy(xpath="//button[contains(@style,'cursor: pointer;')]")
	private WebElement corporatedownload;
	
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickLoginbtn() {
		lg.click();
	}
	public void setUname(String username) {
		uname.sendKeys(username);
		
	}
	public void setPsw(String password) {
		psw.sendKeys(password);
		
	}
	public void clicksubmit() {
		submit.click();
	}
	public void clktestimony() {
		testimony.click();
	}
	public void clknewtest() {
		newtestbtn.click();
	}
	public void Tname(String Tname) {
		tformname.sendKeys(Tname);
		
	}
	public void Torg(String Torg) {
		tformorg.sendKeys(Torg);
	}
	public void Ttest(String Ttest) {
		tformtest.sendKeys(Ttest);
	}
	
	public void Tselect() {
		selectcourse.click();
	}
	public void addImage() {
		WebElement choosefile=driver.findElement(By.xpath("//input[contains(@formcontrolname,'img')]"));
		choosefile.sendKeys("D:\\Janza\\logopic\\logojava.png");
	}
	public String Taddtest() {
		
		addtest.submit();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Successfully Added']")));
		String actualsuccess=successtestimony.getText();
		return actualsuccess;
		
		
	}
	public void clkpartnershipadmin() {
		partnershipadmin.click();
	}
	public void clkdownload() {
		ptrdwnloadbtn.click();
	}
	public void clkcorporate() {
		corporateadmin.click();
		
	}
	public void clkcorporatedownload() {
		corporatedownload.click();
	}
	


}
