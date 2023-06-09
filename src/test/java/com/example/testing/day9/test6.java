package com.example.testing.day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test6 {
	WebDriver driver;
  @Test
  public void OpenDriver() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("");
	  
  }
}