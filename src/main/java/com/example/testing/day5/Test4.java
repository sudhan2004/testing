package com.example.testing.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://j2store.net/free/");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)", "");
	    WebElement web = driver.findElement(By.linkText("Clothing (5)"));
	    web.click();
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.navigate().forward();
	    Thread.sleep(1000);
	    driver.navigate().refresh();
	    driver.quit();
	}

}