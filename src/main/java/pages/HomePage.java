package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Helper1;
public class HomePage {
WebDriver driver;
@FindBy(xpath="//a[test()='Contacts']")
WebElement contactslink;
@FindBy(xpath="//a[test()='New Contacts']")
WebElement newcontactslink;
@FindBy(xpath="//td[@align='left' and @class='headertext']")
WebElement loggedUserName;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public String verifyloggedUserName() {
	return loggedUserName.getText();
}
public NewContactPage navigateToNewContactsPage() {
	Helper1.mouseHoverAndClickActions(driver,contactslink,newcontactslink);
	return new NewContactPage(driver);
}
}
