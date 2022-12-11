package com.groupfive.scripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.groupfive.pages.LoginPage;
import com.groupfive.pages.Logout;
import com.groupfive.utility.XcelUtility;

public class LoginPage_Test extends Base {
	@Test
	public void login() throws IOException {
		String uname = XcelUtility.getCellValue("LoginData",0, 0);
		String psw = XcelUtility.getCellValue("LoginData",0, 1);
		LoginPage Login;
		Login = new LoginPage(driver);
		Login.clickLoginbtn();
		Login.setUname(uname);
		Login.setPsw(psw);
		Login.clicksubmit();
	}
	@AfterMethod
	public void logout() {
		Logout logout;
		logout = new Logout(driver);
		logout.admin();
		logout.logout();
		
	}
}
