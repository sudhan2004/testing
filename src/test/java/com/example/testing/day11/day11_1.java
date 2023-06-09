package com.example.testing.day11;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class day11_1 {
  @Test
  public class CombinedCode {
	    @Test
	    public void executeTest() {
	        // Extent Reports code
	        ExtentSparkReporter spark = new ExtentSparkReporter("extentReport1.html");
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(spark);
	        ExtentTest test = extent.createTest("Facebook", "Login for Facebook");
	        
	        // Selenium WebDriver code
	        WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.godaddy.com/");
	        String title = driver.getTitle();
	        Assert.assertEquals(title, driver.getTitle());
	        System.out.println(title);
	        // Logging test status to Extent Reports
	        if (title.equals(driver.getTitle())) {
	            test.log(Status.PASS, "Test Passed");
	        } else {
	            test.log(Status.FAIL, "Test Failed");
	        }

	        // Closing browser and generating Extent Reports
	        driver.quit();
	        extent.flush();
	    }
	}

}
