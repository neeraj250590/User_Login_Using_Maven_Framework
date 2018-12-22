package com.org.learningMaven.LoginUserUnduit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BrowserInvoke {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void invokeMethod() 
	{
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://unduit.com/uat/");	
	}
	
	
}
