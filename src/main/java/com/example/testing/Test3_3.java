package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_3 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.opencart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Featured");
		
//		driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
		
		driver.quit();
	}
}
