package testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;

public class Testbase {
	public static WebDriver driver;
	@BeforeSuite
	public void init() {
		driver=BrowserFactory.browserSetUp("chrome","https://www.crmpro.com/");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}	
}
	


