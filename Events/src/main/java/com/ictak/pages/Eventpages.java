package com.ictak.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import com.ictak.scripts.EventBase;

public class Eventpages  {
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='dropdownMenuDocs' and text()=' Events ']")
	private WebElement mainMenu;
	
	//@FindBy(xpath="//*[@class='text-sm'][contains(text(),'Academic and industrial conclave') ]")
	@FindBy(xpath="//*[text()='Academic and industrial conclave']")
	//@FindBy(xpath="//span[@class='text-sm'][contains(text(),'Academic and industrial conclave')]")
	private WebElement subMenu;
	
	@FindBy(name="name")
	private WebElement username;
	
	
	@FindBy(xpath="//*[@type=\"email\"]")
	private WebElement email;
	
	@FindBy(name="phoneno")
	private WebElement number;

	@FindBy(xpath="//button[text()='Register' and @type='submit']")
	private WebElement register;
	
	
	@FindBy(xpath="//*[text()=\" Apply Now \"]")
	private WebElement apply;
	
	public Eventpages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
    public void setUserName(String strUserName)
    {
    	username.sendKeys(strUserName);
    }
    public void setEmail(String strEmail)
    {
    	email.sendKeys(strEmail);
    }
    public void setNumber(String phNumber)
    {
    	number.sendKeys(phNumber);
    }
    public void clickRegister()
    {
    	register.click();
    }
    
   public void clickApply()
    {
    	apply.click();
    }
   public String checkAssert()
   {
	   Alert confirmation = driver.switchTo().alert();
	   String alerttext = confirmation.getText();
	   confirmation.accept();
	   return alerttext;
   }
   
   
   public void clickEvents()
   {
	   Actions actions = new Actions(driver);
	   actions.moveToElement(mainMenu).build().perform();
	   subMenu.click();
   }
    
   
}  
   
     
   