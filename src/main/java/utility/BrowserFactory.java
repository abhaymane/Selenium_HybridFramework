package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static WebDriver browserSetUp(String bname,String url ) {
	if(bname.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\eclipse-workspace\\selenium_automation\\Driver1\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(bname.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	
	
	else {
		System.out.println("browser name is not matching");
	} 
	driver.manage().window().maximize();
	driver.get(url);
	return driver;

}
	
}
