package com.ictacademy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ictacademy.base.Testbase;

public class Partnership extends Testbase {
	WebDriver driver;
	//@FindBy(xpath="//*[@id=\"dropdownMenuDocs\"]")
	@FindBy(xpath="//a[text()=' Memberships ']")
	private WebElement membership;
	@FindBy(xpath="//a[@routerlink='/LandingPage/partnership']")
	private WebElement partnershp;
	@FindBy(xpath="//button[@type='submit' and @routerlink='/LandingPage/partnershipform']")
	private WebElement Rbutton;
	@FindBy (xpath="//input[@placeholder='Name' and@formcontrolname='name']")
	private WebElement inName;
	@FindBy(xpath="//input[@placeholder=' Email']")
	private WebElement inemail;
	@FindBy(xpath="//input[@placeholder=' Contact Number']")
	private WebElement phnum;
	@FindBy(xpath="//input[@name='firm']")
	private WebElement infirm;
	@FindBy(xpath="//input[@name='address']")
	private WebElement inaddress;
	@FindBy(xpath="//input[@name='district']")
	private WebElement indist;
	@FindBy(xpath="//input[@name='officeSpace']")
	private WebElement inoffspace;
	@FindBy(xpath="//input[@name='employeeCount']")
	private WebElement inemployees;
	@FindBy(xpath="//textarea[@name='report']")
	private WebElement inReport;
	@FindBy(xpath="//textarea[@name='expect']")
	private WebElement inexpects;
	@FindBy(xpath="//textarea[@name='profile']")
	private WebElement inpromoters;
	@FindBy(xpath="//button[@value='Submit']")
	private WebElement sendmsg;
	
	
	public Partnership(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickmship() {
		Actions actions = new Actions(driver);
		actions.moveToElement(membership);
		actions.build().perform();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickptship() {
		partnershp.click();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickRbutton() {
		Rbutton.click();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void fillname(String Uname) {
		inName.sendKeys(Uname);
	}
	public void fillemail(String email) {
		inemail.sendKeys(email);
	}
	public void fillphnum(String mobnum) {
		phnum.sendKeys(mobnum);
	}
	public void fillfirm(String firm) {
		infirm.sendKeys(firm);
	}
	public void filladdress(String address) {
		inaddress.sendKeys(address);
	}
	public void filldist(String dist) {
		indist.sendKeys(dist);
	}
	public void filloffspace(String offspace) {
		inoffspace.sendKeys(offspace);
	}
	public void fillemployees(String employees) {
		inemployees.sendKeys(employees);
	} 
	public void fillreport(String report) {
		inReport.sendKeys(report);
	}
	public void fillexpects(String expects) {
		inexpects.sendKeys(expects);
	}
	public void fillpromoters(String promoters) {
		inpromoters.sendKeys(promoters);
	}
	public void clksendmsg() {
		sendmsg.submit();
	}

	

}
