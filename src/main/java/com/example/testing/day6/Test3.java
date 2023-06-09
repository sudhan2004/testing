package com.example.testing.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("sample@yahoo.com");
	    driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("samplepass123");
	    WebElement computerAcc=driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]"));
	    computerAcc.click();
	}
}