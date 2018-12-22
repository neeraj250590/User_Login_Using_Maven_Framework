package com.org.learningMaven.LoginUserUnduit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeScreen_test {
	
WebDriver driver;

@FindBy (xpath="//ul[@id='rightNav']//a[@class='signinnav']")
WebElement signin;

@FindBy (xpath="//input[@id='exampleInputEmail1']")
WebElement Email;

@FindBy (xpath="//input[@id='exampleInputPassword1']")
WebElement Password;

@FindBy (xpath="//a[@id='ajaxsignin']")
WebElement SigninButton;

	public void signin_menu(WebDriver driver)
	{
		//driver.findElement(By.xpath("//ul[@id='rightNav']//a[@class='signinnav']")).click();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		signin.click();
	}
		
	public void UserLogin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Email.sendKeys("cpr@mailinator.com");
		Password.sendKeys("123456");
		SigninButton.click();
	}
	
}
