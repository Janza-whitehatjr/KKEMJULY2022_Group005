package com.ictakwebsite.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.AdminUserPage;
import com.ictakwebsite.pages.LoginPage;
import com.ictakwebsite.pages.Logout;
import com.ictakwebsite.utilities.Excelutility;

public class AdminUserTest extends TestBase {

	AdminUserPage objAdminuser;
	@BeforeMethod
	public void verifyValidLogin() throws IOException {
		
		LoginPage objLogin=new LoginPage(driver);
				objLogin.clickLogin();
				String username=Excelutility.getCellData("login", 0, 0);
				String password =Excelutility.getCellData("login", 0, 1);
				objLogin.setUserName(username);
				objLogin.setPassword(password);;
				objLogin.clickSignin();			
	}
	@Test
	public void VerifyAdminUserTest() throws IOException {
		
		objAdminuser=new AdminUserPage(driver);
		objAdminuser.clickAdminUser();
		objAdminuser.clickNewAdmin();
		
		String username=Excelutility.getCellData("admin_user", 0, 0);
		String firstname=Excelutility.getCellData("admin_user", 0, 1);
		String lastname=Excelutility.getCellData("admin_user", 0, 2);
		String email=Excelutility.getCellData("admin_user", 0, 3);
		String des=Excelutility.getCellData("admin_user", 0, 4);
		String passwd=Excelutility.getCellData("admin_user", 0, 5);
		
		
		objAdminuser.setUserName(username);
		objAdminuser.setFirstName(firstname);
		objAdminuser.setLastName(lastname);
		objAdminuser.setEmail(email);
		objAdminuser.setDes(des);
		objAdminuser.setPasswd(passwd);
		objAdminuser.clickAdd();
		
		 WebElement popupok =driver.findElement(By.xpath("//button[@type='button'][text()='OK']"));
		 //System.out.println(popupok.getText());
		 assertTrue(popupok.isDisplayed());
		 popupok.click();
		
		
	}
	@AfterMethod
	public void logout() {
		
		Logout objLogout=new Logout(driver);
		objLogout.admin();
		objLogout.logout();
	
		
	}
}

