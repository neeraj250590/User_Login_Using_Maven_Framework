package com.org.learningMaven.LoginUserUnduit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinScreen_test {
  
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='exampleInputEmail1']")
	WebElement Email;

	@FindBy (xpath="//input[@id='exampleInputPassword1']")
	WebElement Password;

	@FindBy (xpath="//a[@id='ajaxsignin']")
	WebElement SigninButton;

  public void UserLogin(WebDriver driver) 
  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Email.sendKeys("cpr@mailinator.com");
		Password.sendKeys("123456");
		SigninButton.click();
  }
}
