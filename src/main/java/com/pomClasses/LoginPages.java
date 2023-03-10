package com.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPages
{
	//Find MobileElement-
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Log in']")
	public MobileElement login;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Login using Google']")
	public MobileElement loginGoogle;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container']")
	public MobileElement Mail;
	
	//Constructor
	public LoginPages(WebDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	//Method of Respective MobileElement
    public void login()
    {   
       login.click();
    }
	public void loginGoogle()
    {   
		loginGoogle.click();
    }
	public void MailButton()
    {   
		Mail.click();
    }
	
}