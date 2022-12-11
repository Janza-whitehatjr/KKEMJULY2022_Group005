package com.group5.pages;

import static org.testng.Assert.assertTrue;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CoursesPage {
	WebDriver driver; 
	@FindBy(xpath="//a[@id=\"dropdownMenuBlocks\"]")
	private WebElement course;
	@FindBy(xpath="//h6[contains(text(),\"Software Testing\")]")
	private WebElement softwaretesting;
	@FindBy (xpath="//button[contains(text(),\"Apply Now\")]")
	private WebElement apply;
	@FindBy (xpath="//input[@name=\"name\"]")
	private WebElement name;
	@FindBy (xpath="//*[@id=\"exampleModalSignup\"]/div/div/div/div/div[2]/form/div[2]/input")
	//[@placeholder=\"Enter Your Email\"]//input[@name=\"email\"]
	private WebElement email;
	@FindBy (xpath="//input[@name=\"phoneno\"][@placeholder=\"Number\"]")
	private WebElement number;
	@FindBy (xpath="//button[contains(text(),'Register')]")
	private WebElement reg;
	
	public CoursesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void Courses() throws Exception
	{
		Actions action=new Actions(driver);
		action.moveToElement(course).build().perform();
		Thread.sleep(2000);
	}
	public void stesting() throws Exception
	{
		softwaretesting.click();
		Thread.sleep(2000);
	}
	public void applynow() throws Exception
	{
		apply.click();
		Thread.sleep(2000);
	}
	public void uname(String uname) throws Exception
	{
		name.sendKeys(uname);
		Thread.sleep(2000);
	}
	
	public void email(String uemail) throws Exception
	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
//		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Enter Your Email\"]")));
//		Actions action = new Actions (driver);
//		action.moveToElement(email).click().perform();
		email.sendKeys(uemail);
		Thread.sleep(2000);
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Email\"]"));
//		Point point = element.getLocation();
//		int xcord = point.getX();
//		int ycord = point.getY();
//		System.out.println(xcord + ", " + ycord);
//		js.executeScript("window.scrollTo(" + xcord + "," + ycord + ");");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Enter Your Email\"]")));
//		email.click();
	}
	public void number(String unumber) throws Exception
	{
		number.sendKeys(unumber);
		Thread.sleep(2000);
	}
	public void reg() throws Exception
	{
		reg.click();
		Thread.sleep(2000);
	}
	public void checkassert()
	{
		Boolean verify = driver.switchTo().alert().getText().equalsIgnoreCase("Registration Successfull");
		assertTrue(verify);
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
}
