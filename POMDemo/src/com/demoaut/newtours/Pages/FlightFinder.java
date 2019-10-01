package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type='radio']:nth-child(2)")
	@CacheLookup
	private WebElement businessClass;

	@FindBy(name = "airline")
	@CacheLookup
	private WebElement flights;

	@FindBy(name = "findFlights")
	@CacheLookup
	private WebElement submit;

	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void findFlight() {
		businessClass.click();
		Select drpdown = new Select(flights);
		drpdown.selectByIndex(2);
		submit.click();

	}

}
