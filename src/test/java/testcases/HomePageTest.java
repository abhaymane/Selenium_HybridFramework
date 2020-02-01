package testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage1;
import testbase.Testbase2;
import utility.BrowserFactory2;

public class HomePageTest extends Testbase2 {
 public WebDriver driver;
 LoginPage1 login;
 HomePage homepage;
 @BeforeMethod
 public void setUp() {
	 driver=BrowserFactory2.browserSetUp(configDataProvider.getKey("browser"),configDataProvider.getKey("qaUrl"));
	 login=new LoginPage1(driver);
			login.verifyLoginIntoAnApplication(excelDataProvider.getStringCellData(1,4,0),
					 excelDataProvider.getStringCellData(1,4,1));
 }
 
 @Test(priority=1)
	public void verifyloggedUserNameTest(){
		
		helper.switchToIFrame(driver, "mainpanel");
		String uname=homepage.verifyloggedUserName();
		
		if(uname.contains("Mayuri_257")){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
	}
	@Test(priority=2)
	public void navigatetoNewContactsPageTest(){
		helper.switchToIFrame(driver,"mainpanel");
		homepage.navigateToNewContactsPage();
	}
}
