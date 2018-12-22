package com.org.learningMaven.LoginUserUnduit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SigninScreen {
	
	public static WebDriver driver;
	
	@Test(priority=2)
	public void login_user() throws InterruptedException
	{	
		signinScreen_test st = new signinScreen_test();
		Thread.sleep(2000);
		st.UserLogin(driver);
	}
}
