package com.demoaut.newtours.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;

public class ValidateUserTest  {
	
	WebDriver driver;

	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void userValidation() {
		Login lp = new Login(driver);
		lp.applicationLogin("mercury", "mercury");
		FlightFinder flighFinder = new FlightFinder(driver);
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = flighFinder.getTitle(driver);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@AfterClass
	public void closeBrowser() { 
		driver.close();
	}

}
