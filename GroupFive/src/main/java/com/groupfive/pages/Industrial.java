package com.groupfive.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class Industrial extends Base {
	// WebDriver driver;
	
	@FindBy(xpath = "//a[@routerlink='/adminpage/industrial']")
	private WebElement know;
	@FindBy(xpath = "//a[@routerlink='/adminpage/industryAdd']")
	private WebElement addknow;
	@FindBy(xpath = "//input[@formcontrolname='img']")
	private WebElement img;
	@FindBy(xpath = "//button[@title= \"Next\"]")
	private WebElement addfile;
	@FindBy(xpath = "//button[text()= \"OK\"]")
	private WebElement ok;
	@FindBy(xpath = "//h2[text()=\"Successfully Added\"]")
	private WebElement success;

	public Industrial(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickknow() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@routerlink='/adminpage/knowledge']")));

		wait.until(ExpectedConditions.visibilityOf(know));
		know.click();

	}

	public void addknow() throws Exception {
		addknow.click();

	}

	public void addimg() throws Exception {

		//WebElement chooseFile = driver.findElement(By.xpath("//input[@formcontrolname='img']"));
		img.sendKeys("/Users/arjun/git/GroupFive/img/ictlogo.png");

	}

	public void addfile() throws Exception {
		addfile.click();

	}

	public String clk() throws Exception {

		String actualText = success.getText();
		System.out.println(actualText);
		ok.sendKeys(Keys.ENTER);
		return actualText;

	}
}
