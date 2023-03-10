package com.TestClasses;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pomClasses.LoginPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import reports.ExtentReportDemo;

public class Login extends ExtentReportDemo
{
	WebDriver driver;
	 @BeforeTest
     public void  ApplicationPage() throws MalformedURLException
     {
    	 DesiredCapabilities caps =new DesiredCapabilities();
 		
         caps.setCapability("udid", "18f9b0b7");
   	     caps.setCapability("platformName", "Android");
   	     caps.setCapability("deviceName", "M2101K7AI");
   		 caps.setCapability("app", "D:\\app-debug.apk");
   		 driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
     }
     @Test
     
     public void LoginTest() throws IOException, InterruptedException 
 
     {
    	 
    	 ExtentTest logger=extent.createTest("YSL 2.0","MobileAutomation" );
 		 logger.log(Status.INFO, "Login Test");
         Thread.sleep(30000);
 		// test.addScreenCaptureFromPath(CaptureScreenshot(driver));
    	 LoginPages lp =new LoginPages(driver);
       
    	 lp.login();
    	 Thread.sleep(30000);
         logger.addScreenCaptureFromPath(CaptureScreenshot(driver));
         
 		
// 		 test1.loginGoogle();
// 		Thread.sleep(30000); 
// 		 test.addScreenCaptureFromPath(CaptureScreenshot(driver));
// 		 test.pass("Login Using Google button");
//  		 
//  		
//         test1.MailButton();
//   		 Thread.sleep(30000);
//         test.addScreenCaptureFromPath(CaptureScreenshot(driver));
//   		 test.pass("mail Button click");
//   		 
    	 
     }
     
     @AfterTest
     
     public void teardown()
     {
    	 
     }
     
     
}
