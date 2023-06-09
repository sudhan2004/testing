package com.example.testing.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		
		driver.manage().window().maximize();
		
		String url1 = driver.getCurrentUrl();
		
		if(url1.equals("https://j2store.net/free/"))
		{
			System.out.println("URL1 is same");
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
        
		String url2 = driver.getCurrentUrl();
		
		if(url2.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("URL2 is same");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
} 
