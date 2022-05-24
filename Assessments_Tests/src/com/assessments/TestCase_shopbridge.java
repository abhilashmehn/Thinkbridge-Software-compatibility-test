package com.assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_shopbridge {
		public static void main(String args[]) throws Exception {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		//open application
		driver.get("//url");
		//add items
		driver.findElement(By.name("add_items")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("product name");
		driver.findElement(By.name("description")).sendKeys("description");
		driver.findElement(By.name("price")).sendKeys("1000");
		WebElement file= driver.findElement(By.name("image"));
		file.sendKeys("C:/path/to/file.jpg");
		System.out.println("item added successfully");
		//close browser
		driver.quit();
		System.out.println("Browser closed");
		}
}
