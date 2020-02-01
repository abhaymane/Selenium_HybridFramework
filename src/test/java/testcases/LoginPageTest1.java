package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import testbase.Testbase1;
import utility.BrowserFactory1;

public class LoginPageTest1 extends Testbase1 {
	public LoginPage login;
	public WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=BrowserFactory1.browserSetUp(configDataProvider.getKey("browser"),configDataProvider.getKey("qaUl"));
		login=PageFactory.initElements(driver, LoginPage.class);
		//login=new LoginPage(driver)
	}
	@Test
	public void verifyLoginTest() {
		login.verifyLogin(excelDataProvider.getStringCellData(1,1,0),excelDataProvider.getStringCellData(1,1,1));
		
	}
	/*@Test
	 * public void verifyLoginTest(){
	 login.verifyLogin(configDataProvider.getKey("uname"),
	 configDataProvider.getKey("upass"));
	 driver.switchTo().frame("mainpanel");
	 WebElement username=driver.findElement(By.xpath("//td[@align='left'and @class='headertext']"));
	 String userText=username.getText();
	 if(userText.contains("Mayuri")){
	 Assert.assertTrue(userText.contains("Mayuri"));
	 }
	 else{
	 Assert.assertTrue(userText.contains("Mayuri"));
	 }
	 }
	 */
	
}

