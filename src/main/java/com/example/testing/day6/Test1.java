package com.example.testing.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-firstname")).sendKeys("Bharath");
        driver.findElement(By.id("input-lastname")).sendKeys(".S");
        driver.findElement(By.id("input-email")).sendKeys("727821tuic004@skct.edu.in");
        driver.findElement(By.id("input-password")).sendKeys("kutty@2006");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3800)","");
        Thread.sleep(1000);
        driver.findElement(By.id("input-newsletter-yes")).click();
        js.executeScript("window.scrollBy(0,3800)","");
        driver.findElement(By.name("agree")).click();        
        WebElement s=driver.findElement(By.cssSelector(".btn-primary"));s.click();
        s.getText();
    }
}