package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.Testbase;

public class LoginPageTest extends Testbase {
	LoginPage login;
	@BeforeMethod
	public void setUp() {
		login=new LoginPage(driver);
	}
	@Test
	public void verifyLoginTest() {
		login.verifyLogin();
		
	}
	

}
