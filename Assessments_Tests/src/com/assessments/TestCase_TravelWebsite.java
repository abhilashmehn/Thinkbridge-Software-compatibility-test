package com.assessments;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.jodah.failsafe.internal.util.Assert;

public class TestCase_TravelWebsite {
	public static void main(String args[]) throws Exception {
		//Launch a new Browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		//Open URL
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		//Validate that the dropdown has "English" and "Dutch"
		 String[] exp = {"English","Dutch"};
		 WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"language\"]/div[1]/span"));  
		 Select select = new Select(dropdown); 
		 List<WebElement> options = select.getOptions();  
		 for(WebElement we:options){  
		  boolean match = false;
		  for (int i=0; i<exp.length; i++){
		      if (we.getText().equals(exp[i]){
		        match = true;
		        }
		  }
		  Assert.assertTrue(match);
		  } 
		//Fill in your name.
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Abhilash Men");
		//For organization, use your name as well
		driver.findElement(By.xpath("//*[@id=\"orgName\"]")).sendKeys("Abhilash Men");
		//Input your email address
		driver.findElement(By.xpath("//*[@id=\"singUpEmail\"]")).sendKeys("abhilashmen4@gmail.com");
		//Click on "I agree to the Terms And Conditions"
		driver.findElement(By.xpath("//div[contains(@class,'black-color ng-binding')]/div[contains(@class,'ng-binding')]/div[contains(@class,'form-group custom-form-group']")).click();
		//Click on "SignUp"
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/fieldset/div[5]/button")).click();
		//Validate that you received an email
		//sorry, unaware of this
	}
}
