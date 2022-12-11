package com.groupfive.scripts;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import com.base.Base;
import com.groupfive.pages.ContactUs;
import com.groupfive.utility.XcelUtility;

public class ContactUs_Test extends Base {
	@Test
	public void verifyContactUs() throws IOException, Exception	{
		ContactUs ContactUs;
		String uname = XcelUtility.getCellValue("ContactUs",0, 0);
		String email = XcelUtility.getCellValue("ContactUs",0, 1);
		String subject = XcelUtility.getCellValue("ContactUs",0, 2);
		String message = XcelUtility.getCellValue("ContactUs",0, 3);
		ContactUs = new ContactUs(driver);
		ContactUs.clickLoginbtn();
		ContactUs.setUsername(uname);
		ContactUs.setEmail(email);
		ContactUs.setSubject(subject);
		ContactUs.setMessage(message);
		ContactUs.clickSendMessagebtn();
		String actual = ContactUs.clickSendMessagebtn();
		String Expected = "Message Send! Our Expert Team will Contact you Soon!";
		Assert.assertEquals(actual, Expected);
		
	}
	
}
