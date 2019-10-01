package com.demoaut.newtours.Testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	ChromeDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		// 2) Maximize browser
		driver.manage().window().maximize();
		// 3) Open the URL
		driver.get("https://facebook.com/");
	}
	
	@Test
	public void testApp() {
		driver.findElementByLinkText("Instagram").click();
		// 5) Navigate to the new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		// 6) Select 'Italiano' as language instead of English
		//driver.findElementByXPath("//select[@class='hztqj']").click();
		WebElement language = driver.findElementByXPath("//select[@class='hztqj']");
		Select select = new Select(language);
		select.selectByVisibleText("Italiano");
		
		driver.quit();
	}
	
	

}
