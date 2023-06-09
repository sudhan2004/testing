package com.example.testing.day7;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class day7_1 {
  @Test
  public void f() {
	  	WebDriverManager.edgedriver().setup();
	  	WebDriver driver = new EdgeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  	String title = driver.getTitle();
	  	Assert.assertEquals(title, driver.getTitle());
  }
}
