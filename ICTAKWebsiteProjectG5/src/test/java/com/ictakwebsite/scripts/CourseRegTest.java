package com.ictakwebsite.scripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.CourseRegPage;
import com.ictakwebsite.pages.LoginPage;
import com.ictakwebsite.pages.Logout;
import com.ictakwebsite.utilities.Excelutility;

public class CourseRegTest extends TestBase {
CourseRegPage objCourse;
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
public void VerifyCourseRegDownload() {
	objCourse=new CourseRegPage(driver);
	objCourse.ClickCourseReg();
	objCourse.clickDownload();
	assertTrue(driver.findElement(By.xpath("//button[contains(text(), 'Download')]")).isDisplayed());
}
@AfterMethod
public void logout() {
	
	Logout objLogout=new Logout(driver);
	objLogout.admin();
	objLogout.logout();
	
	
}

}


