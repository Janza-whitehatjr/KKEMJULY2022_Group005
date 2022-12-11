package com.groupfive.scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.groupfive.pages.Knowledge;
import com.groupfive.pages.LoginPage;
import com.groupfive.pages.Logout;

public class Knowledge_Test extends Base {

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
		public void Knowledge() throws InterruptedException {
			Knowledge knowledge;
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
//		@AfterMethod
//		public void logout() {
//			Logout logout;
//			logout = new Logout(driver);
//			logout.admin();
//			logout.logout();
//			
//		}
	}

