package com.example.testing.pagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.example.testing.pageobjects.RegisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {
	
	
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		RegisterPage.Gender(driver).click();
		
	}
}