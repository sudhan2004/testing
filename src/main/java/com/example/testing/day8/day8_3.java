package com.example.testing.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement value = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		value.sendKeys("401");
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		submit.click();
		Thread.sleep(5000);

		Alert al = driver.switchTo().alert();
		al.dismiss();
		
		value.clear();
		
		Thread.sleep(5000);
		value.sendKeys("402");
		submit.click();
		Thread.sleep(5000);

		al.accept();
		
		Alert bl = driver.switchTo().alert();
		String text = bl.getText();
		Thread.sleep(5000);

		bl.accept();
		
		System.out.println(text);
		
		Thread.sleep(5000);

		driver.quit();
	}
}
