package com.ictak.scripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ictak.pages.AdminEvents;
import com.ictak.pages.EventLinks;
import com.ictak.pages.Eventpages;
import com.ictak.pages.Loginpages;
import com.ictak.utility.Excelutility;


public class EventClass extends EventBase {
	
	Eventpages objEvents;
		
	@Test
	public void verifyRegisterEvents() throws IOException, InterruptedException
	{
		objEvents=new Eventpages(driver);
		objEvents.clickEvents();
		objEvents.clickApply();
		String username=Excelutility.getCellData("eventreg",0, 0);
		String email=Excelutility.getCellData("eventreg",0, 1);
		String phone=Excelutility.getCellData("eventreg",0, 2);
		
		objEvents.setUserName(username);
		objEvents.setEmail(email);
		objEvents.setNumber(phone);
		objEvents.clickRegister();
		
		String alerttext=objEvents.checkAssert();
		String expectedMessage="Registration Successfull";
		assertEquals(alerttext,expectedMessage);
				
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}


