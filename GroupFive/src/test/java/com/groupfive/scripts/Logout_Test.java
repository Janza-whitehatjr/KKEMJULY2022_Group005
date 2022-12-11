package com.groupfive.scripts;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.groupfive.pages.LoginPage;
import com.groupfive.pages.Logout;




public class Logout_Test extends Base{
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
	public void Logout() throws Exception {
		Logout logout;
		logout = new Logout(driver);
		logout.admin();
		logout.logout();

	}
	
}
