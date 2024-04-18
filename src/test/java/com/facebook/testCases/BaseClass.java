package com.facebook.testCases;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	 public String baseURL="https://www.facebook.com/";
	 public String username="kumaripeta1998@gmail.com";
	 public String password="Kumari@12345";
	 public static WebDriver driver;
//public static Logger logger;
@BeforeClass
public void setup()
{
System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
driver=new ChromeDriver();	
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
}