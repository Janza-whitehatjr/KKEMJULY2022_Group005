package com.ictacademy.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	 public static WebDriver driver;
	public static Properties prop=null;
	String driverPath="D:\\applns\\chromedriver_win32_108\\chromedriver.exe" ;
	public static void TestBase() throws IOException
	{
		try
		{
		prop= new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
		@BeforeSuite
		public void onSetup() throws IOException
		{
			TestBase();
			String browserName= prop.getProperty("browser");
			//D:\chromedriver_win32_108
			if(browserName.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", "D:\\applns\\chromedriver_win32_108\\chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if(browserName.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				//System.setProperty("webdriver.gecko.driver", driverPath);
				driver= new FirefoxDriver();
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();

}
		@AfterSuite
		public void Teardown() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
	}
