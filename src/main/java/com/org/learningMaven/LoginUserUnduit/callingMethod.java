package com.org.learningMaven.LoginUserUnduit;

import org.testng.annotations.Test;

public class callingMethod extends BrowserInvoke {

	
//	@Test(priority=1)
	@Test(priority=0)
	public void clicking_signin_menu_home_screen() throws InterruptedException
	{
		homeScreen_test HS = new homeScreen_test();
		HS.signin_menu(driver);
	} 
	
	@Test(priority=1)
	//@Test
	public void login_user() throws InterruptedException
	{
		//homeScreen_test HS = new homeScreen_test();
		signinScreen_test HS = new signinScreen_test();
		Thread.sleep(2000);
		HS.UserLogin(driver);
	}
	
}
