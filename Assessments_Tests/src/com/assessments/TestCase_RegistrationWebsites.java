package com.assessments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_RegistrationWebsites {
	public static void main(String args[]) throws Exception {
		//Launch a new Browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		//Open URL
		driver.get("https://www.bestundertaking.net/NewConnection.aspx");
		
		//Provide your feedback/improvements/suggestions as a Functional Quality Engineer and as an End - User in terms of
		
		//Functional 
		// Upload Required Document's - Documents supported format should be defined, Documents Size should be defined
		// Error should be handle, user getting errors in most of the scenarios
		
		//usability
		//form lenght is too long
		//user entered any invalid data application shows error, user has to enter data from starting
		
		//UI Aesthetics
		// UI is preatty simple and straight forward
		// Form scrolling can be reduced by adjusting the inputs in gaps
}
}

