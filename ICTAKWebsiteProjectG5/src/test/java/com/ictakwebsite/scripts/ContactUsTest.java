package com.ictakwebsite.scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.ContactUsPage;
import com.ictakwebsite.utilities.Excelutility;

public class ContactUsTest extends TestBase{
	ContactUsPage objContactus;
	@BeforeMethod
	public void objectContactUs() {
	
	objContactus=new ContactUsPage(driver);
	}
	@Test
	public void verifyValidMessage() throws InterruptedException, IOException {
		ContactUsPage objContactus=new ContactUsPage(driver);
		objContactus.clickContactus();
		String username=Excelutility.getCellData("contactus", 0, 0);
		String email=Excelutility.getCellData("contactus", 0, 1);
		String course=Excelutility.getCellData("contactus", 0, 2);
		String message=Excelutility.getCellData("contactus", 0, 3);
		objContactus.setName(username);
		objContactus.setEmail(email);
		objContactus.courseName(course);
		objContactus.setMessage(message);
		String Actual=objContactus.clicksendMsg();
		String Expected="Message Send! Our Expert Team will Contact you Soon!";
		assertEquals(Actual, Expected);
		
	}
	

}


