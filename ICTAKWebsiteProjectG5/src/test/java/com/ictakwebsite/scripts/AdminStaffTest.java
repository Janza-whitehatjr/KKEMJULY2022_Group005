package com.ictakwebsite.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.AdminStaffPage;
import com.ictakwebsite.pages.AdminUserPage;
import com.ictakwebsite.pages.LoginPage;
import com.ictakwebsite.pages.Logout;
import com.ictakwebsite.utilities.Excelutility;

public class AdminStaffTest extends TestBase{
AdminStaffPage objAdminstaff;
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
	public void VerifyAdminStaffTest() throws IOException {
		
		objAdminstaff=new AdminStaffPage(driver);
		objAdminstaff.clickStaff();
		objAdminstaff.clickAddStaff();
		
		String username=Excelutility.getCellData("admin_staff", 0, 0);
		String des=Excelutility.getCellData("admin_staff", 0, 1);
		String about=Excelutility.getCellData("admin_staff", 0, 2);
		String image=Excelutility.getCellData("admin_staff", 0, 3);
		
		
		objAdminstaff.setUserName(username);
		objAdminstaff.setDes(des);
		objAdminstaff.setAboutUS(about);
		objAdminstaff.setfile(image);
		objAdminstaff.clickadd();
		
		
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
