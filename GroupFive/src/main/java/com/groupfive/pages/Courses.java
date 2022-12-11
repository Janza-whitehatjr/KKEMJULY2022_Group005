package com.groupfive.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class Courses extends Base {

	//WebDriver driver;

	@FindBy(xpath = "//a[@id=\"dropdownMenuBlocks\"][@routerlink='/LandingPage/courses']")
	private WebElement ele;
	@FindBy(xpath = "//*[@id=\"navigation\"]/ul/li[3]/ul/div[1]/li[1]/a/div")
	private WebElement clk;
	@FindBy(xpath = "/html/body/app-root/app-single-page/body/header/div[1]/div[1]/div/div/button")
	private WebElement btn;
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement nam;
	@FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
	private WebElement eml;
	@FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")
	private WebElement mob;
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement reg;
	@FindBy(xpath = "//a[text()='Partners']")
	private WebElement agenda;

	public Courses(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickcrs() {
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).build().perform();

	}

	public void clk() {
		clk.click();

	}

	// Agenda >

	public void agd() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Partners']"));
		Point point = element.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		System.out.println(xcord + ", " + ycord);
		js.executeScript("window.scrollTo(" + 100 + "," + 861 + ");");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Partners']")));
		agenda.click();
	}

	// Agenda <

	public void btn() {
		btn.click();

	}

	public void setnam(String setnam) {
		nam.sendKeys(setnam);

	}

	public void seteml(String seteml) {
		eml.sendKeys(seteml);

	}

	public void setmob(String setmob) {
		mob.sendKeys(setmob);

	}

	public void reg() {
		reg.click();

	}

	public void msg() {

		Boolean verify = driver.switchTo().alert().getText().equalsIgnoreCase("Registration Successfull");
		assertTrue(verify);
		driver.switchTo().alert().accept();

	}
}
