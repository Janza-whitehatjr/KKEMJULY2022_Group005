package com.ictakwebsite.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.LoginPage;
import com.ictakwebsite.pages.Logout;
import com.ictakwebsite.utilities.Excelutility;

public class LogoutTest extends TestBase{
	
	@BeforeMethod
	public void Login() throws IOException {
		LoginPage objLogin=new LoginPage(driver);
		objLogin.clickLogin();
		String username=Excelutility.getCellData("login", 0, 0);
		String password =Excelutility.getCellData("login", 0, 1);
		objLogin.setUserName(username);
		objLogin.setPassword(password);;
		objLogin.clickSignin();
		
	}
	@Test
	public void VerifyLogOut() {
		Logout objLogout=new Logout(driver);
		objLogout.admin();
		objLogout.logout();
		String ActualTitle="ICT Academy of Kerala";
		String ExpectedTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

}

