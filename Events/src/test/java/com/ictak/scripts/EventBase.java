package com.ictak.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EventBase {
	WebDriver driver;
	public static Properties prop=null;
	//String driverPath=System.getProperty("user.dir")+File.separator+"driver"+File.separator+"chromedriver.exe";
	
	
	public static void EventBase() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/config.properties");
		prop.load(ip);
	}
	@BeforeTest
	public void onSetup() throws IOException
	{
		EventBase();
		String browserName=prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
				
	}
	
	
}
