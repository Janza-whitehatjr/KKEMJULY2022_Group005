package com.ictakwebsite.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.LoginPage;
import com.ictakwebsite.utilities.Excelutility;

public class LoginTest extends TestBase{
	LoginPage ObjLogin;
	@BeforeMethod
	public void loginobject() {
		ObjLogin=new LoginPage(driver);
	}
	@Test
	public void verifyValidLogin() throws IOException {
		
		ObjLogin.clickLogin();

		String username=Excelutility.getCellData("login", 0, 0);
		String password =Excelutility.getCellData("login", 0, 1);
		ObjLogin.setUserName(username);
		ObjLogin.setPassword(password);
		ObjLogin.clickSignin();
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
		 WebElement search= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Add task..']")));
		 search.sendKeys("Automation Testing");
		 search.sendKeys(Keys.ENTER);
		 assertTrue(search.isDisplayed());
		
//		//Staff
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
//		WebElement staff=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Staffs']")));
//		new Actions(driver).moveToElement(staff).click().perform();
//		driver.findElement(By.xpath("//a[@routerlink='/adminpage/add-staffs']")).click();
//		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("name");
//		driver.findElement(By.xpath("//textarea[@name='about']")).sendKeys("good");
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/sonia/OneDrive/Desktop/ict.png");
//		WebElement des=driver.findElement(By.xpath("//select[@name='des']"));
//		Select sel=new Select(des);
//		sel.selectByVisibleText("Head-Knwoledge Officer");
//		driver.findElement(By.xpath("//button[@title='Next']")).click();
		
             	
	}	

}
