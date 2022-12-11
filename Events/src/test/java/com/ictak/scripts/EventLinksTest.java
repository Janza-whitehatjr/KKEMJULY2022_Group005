package com.ictak.scripts;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ictak.pages.EventLinks;

public class EventLinksTest extends EventBase {
	
	@Test
	public void verifyEventLinks()
	{
		
		EventLinks objLinks=new EventLinks(driver);
		WebDriverWait wait;
		objLinks.clickEvents();
		
		objLinks.clickAbout();
		String actualString = driver.findElement(By.xpath("//span[contains(text(),'Skills, Engineering')]")).getText();
		System.out.println(actualString);
		assertTrue(actualString.contains("The International Conclave"));
		
		objLinks.clickObjectives();
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=' Objectives ']")));   
		String actualString1 = driver.findElement(By.xpath("//h3[text()=' Objectives ']")).getText();
		System.out.println(actualString1);
		assertTrue(actualString1.contains("Objectives"));
		
		objLinks.clickOverview();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=' Overview ']"))); 
		String actualString2 = driver.findElement(By.xpath("//h3[text()=' Overview ']")).getText();
		System.out.println(actualString2);
		assertTrue(actualString2.contains("Overview"));
		
		objLinks.clickAgenda();
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Agenda']")));   
		String actualString3 = driver.findElement(By.xpath("//h3[text()='Agenda']")).getText();
		System.out.println(actualString3);
		assertTrue(actualString3.contains("Agenda"));
		
		objLinks.clickTraining();
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Training']")));
		String actualString4 = driver.findElement(By.xpath("//h1[text()='Training']")).getText();
		System.out.println(actualString4);
		assertTrue(actualString4.contains("Training"));
	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
		
}
