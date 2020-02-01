package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LoginPage1;
import testbase.Testbase2;
import utility.BrowserFactory2;
public class LoginPageTest3 extends Testbase2{
	public LoginPage1 login;
	public WebDriver driver;
	@BeforeSuite
	public void setUp() {
		driver=BrowserFactory2.browserSetUp(configDataProvider.getKey
				("browser"),configDataProvider.getKey("qaUrl"));
		login=PageFactory.initElements(driver, LoginPage1.class);
		//login=new LoginPage(driver)
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String actualTitle=login.verifyLoginPageTitle();
		System.out.println("actual title of the login page is :"+actualTitle);
		String expectedTitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	/*@Test(priority=2)
	public void verifyLoginTest(){
	
		login.verifyLogin(excelDataProvider.getStringCellData(1, 1, 0), 
				excelDataProvider.getStringCellData(1, 1, 1));		
		helper.captureScreenshots(driver,"freecrm_login");
	}*/
	
	@Test(priority=2)
	public void verifyLoginIntoAnApplicationTest()
	{
		login.verifyLoginIntoAnApplication(configDataProvider.
				getKey("uname"),
				configDataProvider.getKey("upass"));		
		
		//driver.switchTo().frame("main panel");
		
 
		
		WebElement username=driver.findElement
				(By.xpath("//td[@align='left' and @class='headertext']"));
		
		String user=username.getText();
		
		System.out.println("logged in user name is :"+user);
		
		if(user.contains("Mayuri_257")){
			//Assert.assertTrue(userText.contains("Mayuri"));
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
		
	}
	
}
