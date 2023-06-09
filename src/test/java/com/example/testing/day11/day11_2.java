package com.example.testing.day11;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class day11_2 {
  @Test
  public class CombinedCode {
	    @Test
	    public void executeTest() throws InterruptedException {
	        // Extent Reports code
	        ExtentSparkReporter spark = new ExtentSparkReporter("extentReport2.html");
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(spark);
	        ExtentTest test = extent.createTest("Facebook", "Login for Facebook");
	        
	        // Selenium WebDriver code
	        
	      	  WebDriverManager.chromedriver().setup();
	      	  WebDriver driver = new ChromeDriver();
	      	  driver.get("https://www.godaddy.com/");
	      	  driver.manage().window().maximize();
	      	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	      	  Thread.sleep(3000);
	      	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
	      	  
		      extent.flush();
	    
	}

  }
}
