package com.groupfive.scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.groupfive.pages.Industrial;
import com.groupfive.pages.LoginPage;


public class Industrial_Test extends Base{
	@BeforeMethod
	public void login() {
		LoginPage Login;
		Login = new LoginPage(driver);
		Login.clickLoginbtn();
		Login.setUname("superadmin");
		Login.setPsw("12345");
		Login.clicksubmit();
	}
	@Test
	public void Industrial() throws Exception {
		Industrial Industrial;
		Industrial = new Industrial(driver);
		Industrial.clickknow();
		Industrial.addknow();
		Industrial.addimg();
		Industrial.addfile();
		
	
		String actual=Industrial.clk();
		assertTrue(actual.contains("Successfully Added"));
		
		//driver.close();
	}
//	@AfterMethod
//	public void logout() {
//		Logout logout;
//		logout = new Logout(driver);
//		logout.admin();
//		logout.logout();
//		
//	}
}
