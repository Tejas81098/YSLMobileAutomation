package reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;

public class ExtentReportDemo {
//	  ExtentSparkReporter htmlReporter;
	 public ExtentReports extent;
	 


@BeforeMethod
     public void ReportSetup()
     {
           
	
//        htmlReporter= new ExtentSparkReporter("YSL2.0MobileAutomationExtent.html");
//        htmlReporter.config().setTheme(Theme.DARK);
//        extent= new ExtentReports();
//        
//   	  extent.attachReporter(htmlReporter);
		
		 ExtentHtmlReporter reporter= new ExtentHtmlReporter("YSL2.0MobileAutomationExtent.html");
		 extent= new ExtentReports();
		 extent.attachReporter(reporter);
		
		
		
     }
     
     @Test(priority=1)
     public static String CaptureScreenshot(WebDriver driver) throws IOException
     { 
   	   
       File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	   File destinationFilePath = new File ("C:\\Users\\TUE3525503\\eclipse-workspace\\YSLMobileAutomation\\screenshot\\images.screenshot"+System.currentTimeMillis()+".jpg");
       String absolutepathlocation =destinationFilePath.getAbsolutePath();
   	   FileUtils.copyFile(srcfile, destinationFilePath);
       return absolutepathlocation ;
   	  
     }
     
     @AfterMethod
     public void Teardown()
     {
         extent.flush();
     }
}

