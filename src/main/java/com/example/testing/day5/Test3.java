package com.example.testing.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://j2store.net/free/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
        
        List<WebElement> item_names = driver.findElements(By.xpath("//h2[@class='product-title']"));
        
        for (WebElement webElement : item_names) {
            System.out.println(webElement.getText());
        }
	}
}
