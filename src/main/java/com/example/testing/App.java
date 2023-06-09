package com.example.testing;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new EdgeDriver();
       
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        
    	driver.manage().window().maximize();
        
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sudhan kanna");
        
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
        
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("kannasudhan73@gmail.com");
        
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sudhan1234");
//        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]")).click();
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();        
        
        driver.quit();
    }
}
