package com.ictakwebsite.scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.EventsPage;
import com.ictakwebsite.utilities.Excelutility;

public class EventTest extends TestBase {
	EventsPage objEvent;
	@BeforeMethod
	public void eventObject() {
		objEvent=new EventsPage(driver);
	}
	@Test
	public void VerifyValidEvent() throws IOException {
		objEvent.mouseHoverEvents();
		objEvent.clickIcset();
		objEvent.applyNow();
		String username=Excelutility.getCellData("eventsreg", 0, 0);
		String Email=Excelutility.getCellData("eventsreg", 0, 1);
		String phone=Excelutility.getCellData("eventsreg", 0, 2);
		objEvent.setName(username);
		objEvent.setEmail(Email);
		objEvent.setNumber(phone);
		String Actual=objEvent.ClickRegister();
		String Expected="Registration Successfull";
		assertEquals(Actual, Expected);
						
	}	
}
