package com.groupfive.scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.groupfive.pages.LoginPage;
import com.groupfive.pages.Logout;
import com.groupfive.pages.Patrons;

public class Patrons_Test extends Base{
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
	public void Patrons() throws InterruptedException {
		Patrons patrons;
		patrons = new Patrons(driver);
		patrons.clickknow();
		patrons.addknow();
		patrons.addimg();
		patrons.addfile();
		String actualString = driver.findElement(By.xpath("//h2[text()=\"Successfully Added\"]")).getText();
		System.out.println(actualString);
		assertTrue(actualString.contains("Successfully Added"));
		patrons.clk();
		
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
