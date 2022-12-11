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

public class Patrons extends Base {
	//WebDriver driver;

	@FindBy(xpath = "//a[@routerlink='/adminpage/patrons']")
	private WebElement know;
	@FindBy(xpath = "//a[@href='/adminpage/addpatron']")
	private WebElement addknow;
	@FindBy(xpath = "//button[@title= \"Next\"]")
	private WebElement addfile;
	@FindBy(xpath = "//button[text()= \"OK\"]")
	private WebElement ok;

	public Patrons(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickknow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@routerlink='/adminpage/patrons']")));
		know.click();
	}

	public void addknow() {
		addknow.click();
	}

	public void addimg() {
		WebElement chooseFile = driver.findElement(By.xpath("//input[@formcontrolname='img']"));
		chooseFile.sendKeys("/Users/arjun/git/GroupFive/img/ictlogo.png");
	}

	public void addfile() {
		addfile.click();
	}

	public void clk() {
		ok.sendKeys(Keys.ENTER);
	}

}
