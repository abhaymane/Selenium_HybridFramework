package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.Testbase2;
import utility.BrowserFactory2;

public class LoginTestPage2 extends Testbase2{
	public LoginPage login;
	public WebDriver driver;
	public BrowserFactory2 browserFactory;
	@BeforeMethod
	public void setUp() {
		driver=BrowserFactory2.browserSetUp(configDataProvider.getKey
				("browser"),configDataProvider.getKey("qaUrl"));
		login=PageFactory.initElements(driver, LoginPage.class);
		//login=new LoginPage(driver)
	}
	@Test
	public void verifyLoginTest() {
		login.verifyLogin(excelDataProvider.getStringCellData(1,1,0),excelDataProvider.getStringCellData(1, 1,1));
		login.verifyLogin(excelDataProvider.getStringCellData(1,2,0),excelDataProvider.getStringCellData(1, 2,1));
		login.verifyLogin(excelDataProvider.getStringCellData(1,3,0),excelDataProvider.getStringCellData(1, 3,1));
		login.verifyLogin(excelDataProvider.getStringCellData(1,4,0),excelDataProvider.getStringCellData(1, 4,1));
		helper.captureScreenShots(driver, "login");
	}

}
