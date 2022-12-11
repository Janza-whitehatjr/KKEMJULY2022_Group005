package com.ictacdemy.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ictacademy.base.Testbase;
import com.ictacademy.pages.Homepage;
import com.ictacademy.utilities.Excelutility;

public class TestclassAdminMembership extends Testbase {
	Homepage objLogin;
	@Test
	public void verifyLogin() throws IOException {
		objLogin= new Homepage(driver);
		objLogin.clickLoginbtn();
		String username=Excelutility.getCellData(0, 0);
		String password=Excelutility.getCellData(0, 1);
		objLogin.setUname(username);
		objLogin.setPsw(password);
		objLogin.clicksubmit();
		
	}

	@Test
	public void verifypartnershipdownload() {
		objLogin= new Homepage(driver);
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@routerlink,'/adminpage/partnership')]")));

		objLogin.clkpartnershipadmin();
		objLogin.clkdownload();
		objLogin.clkcorporate();
		objLogin.clkcorporatedownload();
		
	}

}
