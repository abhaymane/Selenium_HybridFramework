package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//object repository :login page
		@FindBy(name="username")
		WebElement user;
		@FindBy(name="password")
		WebElement pass;
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		WebDriver driver;
		public LoginPage1(WebDriver driver){	
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public String verifyLoginPageTitle()
		{
			return driver.getTitle();		
		}
		public HomePage verifyLoginIntoAnApplication(String uname, String upass){
			
			try {

				user.sendKeys(uname);		
				pass.clear();
				pass.sendKeys(upass);
				
				Thread.sleep(5000);
				loginBtn.click();	
				
			} catch (Exception e) {			
				e.printStackTrace();
			}
			return new HomePage(driver);
		}
		
	}

