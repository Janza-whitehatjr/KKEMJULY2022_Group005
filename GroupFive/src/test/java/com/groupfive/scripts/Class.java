package com.groupfive.scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.base.Base;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import com.groupfive.pages.ContactUs;
import com.groupfive.pages.Courses;
import com.groupfive.pages.Industrial;
import com.groupfive.pages.Knowledge;
import com.groupfive.pages.LoginPage;
import com.groupfive.pages.Patrons;
import com.groupfive.pages.Logout;
//import com.groupfive.pages.KnowledgePage;
import com.groupfive.utility.XcelUtility;

public class Class extends Base {
	
	Industrial Industrial;
	ContactUs ContactUs;
	Knowledge knowledge;
	Courses Courses;
	Patrons patrons;
	Logout logout;
	LoginPage Login;

// Login
	
	@Test
	public void login() {
		Login = new LoginPage(driver);
		Login.clickLoginbtn();
		Login.setUname("superadmin");
		Login.setPsw("12345");
		Login.clicksubmit();
	}
	
// Login

	
// COURSE -->

	@Test
	public void verifyCourse() {
		Courses = new Courses(driver);
		Courses.clickcrs();
		Courses.clk();
		Courses.btn();
		Courses.setnam("Automation");
		Courses.seteml("Automationtest@gmail.com");
		Courses.setmob("0011223344");
		Courses.reg();
		Courses.msg();
		//driver.close();
	}

// COURSE <--

//ContactUs -->

	@Test
	public void verifyContactUs() throws IOException, Exception	{

		String uname = XcelUtility.getCellValue("ContactUs",0, 0);
		String email = XcelUtility.getCellValue("ContactUs",0, 1);
		String subject = XcelUtility.getCellValue("ContactUs",0, 2);
		String message = XcelUtility.getCellValue("ContactUs",0, 3);
		ContactUs = new ContactUs(driver);
		ContactUs.clickLoginbtn();
		ContactUs.setUsername(uname);
		ContactUs.setEmail(email);
		ContactUs.setSubject(subject);
		ContactUs.setMessage(message);
		ContactUs.clickSendMessagebtn();
		String actual = ContactUs.clickSendMessagebtn();
		String Expected = "Message Send! Our Expert Team will Contact you Soon!";
		AssertJUnit.assertEquals(actual, Expected);
		// driver.close();
	}

//ContactUs <--

//Knowledge -->

	@Test
	public void Knowledge() throws InterruptedException {
		login();
		knowledge = new Knowledge(driver);
		knowledge.clickknow();
		knowledge.addknow();
		knowledge.addimg();
		knowledge.addfile();
		String actualString = driver.findElement(By.xpath("//h2[text()=\"Successfully Added\"][@id=\"swal2-title\"]")).getText();
		System.out.println(actualString);
		assertTrue(actualString.contains("Successfully Added"));
		knowledge.clk();
		//driver.close();
	}

//Knowledge <--

//Patrons -->

	@Test
	public void Patrons() throws InterruptedException {
		patrons = new Patrons(driver);
		login();
		patrons.clickknow();
		patrons.addknow();
		patrons.addimg();
		patrons.addfile();
		String actualString = driver.findElement(By.xpath("//h2[text()=\"Successfully Added\"]")).getText();
		System.out.println(actualString);
		assertTrue(actualString.contains("Successfully Added"));
		patrons.clk();
	//driver.close();
	}

//Patrons <--

//Industrial -->

	@Test
	public void Industrial() throws Exception {
		Industrial = new Industrial(driver);
		login();
		Industrial.clickknow();
		Industrial.addknow();
		Industrial.addimg();
		Industrial.addfile();
		String actualString = driver.findElement(By.xpath("//h2[text()=\"Successfully Added\"]")).getText();
		System.out.println(actualString);
		assertTrue(actualString.contains("Successfully Added"));
		Industrial.clk();
		//driver.close();
	}

//Industrial <--

//Logout -->

	@Test
	public void Logout() throws Exception {
		logout = new Logout(driver);
		login();
		logout.admin();
		logout.logout();

	}
	
//Logout <--
}
