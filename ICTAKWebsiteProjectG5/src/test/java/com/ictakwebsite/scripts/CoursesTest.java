package com.ictakwebsite.scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictakwebsite.pages.CoursePage;
import com.ictakwebsite.utilities.Excelutility;

public class CoursesTest extends TestBase{
	 CoursePage objCourse;
	 @BeforeMethod
	 public void courseObject() {
		objCourse=new CoursePage(driver) ;
	 }
	 @Test
	public void validCourseReg() throws IOException {
	objCourse=new CoursePage(driver);
	objCourse.mouseOverCourses();
	objCourse.ClickMeanFullStack();
	objCourse.applyNowClick();
	
	String username=Excelutility.getCellData("couresreg", 0, 0);
	String email=Excelutility.getCellData("couresreg", 0, 1);
	String phoneno=Excelutility.getCellData("couresreg", 0, 2);
	
	objCourse.setUsername(username);
	objCourse.setEmail(email);
	objCourse.setPhoneNumber(phoneno);
		
    String ActualText=objCourse.clickRegister();
    System.out.println("actual="+ActualText);
	String Expectedtext="Registration Successfull";
	assertEquals(ActualText, Expectedtext);

	 }
	 }


