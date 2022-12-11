package com.groupfive.pages;

import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class Knowledge extends Base {
	//WebDriver driver;
	@FindBy(xpath = "//a[@routerlink='/adminpage/knowledge'][@href='/adminpage/knowledge']")
	private WebElement know;
	@FindBy(xpath = "//a[@href='/adminpage/addknowledge']")
	private WebElement addknow;
	@FindBy(xpath = "//button[@title= \"Next\"]")
	private WebElement addfile;
	@FindBy(xpath = "//button[text()= \"OK\"]")
	private WebElement ok;

	public Knowledge(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickknow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@routerlink='/adminpage/knowledge'][@href='/adminpage/knowledge']"))).click();
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
