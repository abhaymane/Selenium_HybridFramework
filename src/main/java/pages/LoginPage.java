package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	//object repository :login page
	@FindBy(name="username")
	WebElement user;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	/*
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}*/
	
public void verifyLogin(String un, String up) {
		user.sendKeys(un);
		pass.sendKeys(up);
		loginbtn.click();
		
	}
	
}
	

