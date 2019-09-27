package Sep27;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
Q-Create a program in Selenium using TestNG using so as to verify the error
message which you will get on Facebook on entering a valid username and 
and an invalid password
*/
public class FacebookTestNG {

	
	ChromeDriver driver;
	
	@BeforeTest
	//Open the browser
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
	}
	
	@Test
	public void enterLoginInfo() {
		// 2.Enter right user name in the username textbox
		driver.findElement(By.cssSelector("#email")).sendKeys("affanskitchen2018@gmail.com");

		// 3.Enter wrong password in the password textbox
		driver.findElement(By.cssSelector("#pass")).sendKeys("anypassword");

		// 4.Click on the Login button
		driver.findElement(By.cssSelector("#loginbutton")).click();
	}
	
	@Test
	public void checkLoginError() {
		String expectedError = "The password you’ve entered is incorrect. Forgot Password?";
		String actualError = driver
				.findElement(By.cssSelector(
						"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"))
				.getText();
		Assert.assertEquals(actualError, expectedError);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	
}
