package com.groupfive.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.Base;
import com.groupfive.pages.Courses;
import com.groupfive.utility.XcelUtility;

public class Courses_Test extends Base{
	@Test
	public void verifyCourse() throws IOException {
		String SetName = XcelUtility.getCellValue("Course",0, 0);
		String SetEmail = XcelUtility.getCellValue("Course",0, 1);
		String SetPhone = XcelUtility.getCellValue("Course",0, 1);
		Courses Courses;
		Courses = new Courses(driver);
		Courses.clickcrs();
		Courses.clk();
		Courses.btn();
		Courses.setnam(SetName);
		Courses.seteml(SetEmail);
		Courses.setmob(SetPhone);
		Courses.reg();
		Courses.msg();
		//driver.close();
	}
}
