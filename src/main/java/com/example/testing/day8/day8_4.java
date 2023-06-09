package com.example.testing.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_4 {
	
	public static void main(String args[]) throws InterruptedException {
		System.out.print("Hello World!");
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.abhibus.com/bus-ticket-booking");
	    driver.manage().window().maximize();
	    WebElement src = driver.findElement(By.id("source"));
	    src.sendKeys("Chennai");
	    WebElement des = driver.findElement(By.id("destination"));
	    des.sendKeys("Coimbatore");
	    Thread.sleep(3000);
	    WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value','30/06/2003')",date);
	    driver.findElement(By.id("seo_search_btn")).click();
	    
	
	}
}