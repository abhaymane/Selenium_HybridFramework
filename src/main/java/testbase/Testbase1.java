package testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import utility.BrowserFactory1;
import utility.ConfigDataProvider;
import utility.ExcelDataProvider;

public class Testbase1 {
	public ConfigDataProvider configDataProvider;
	public BrowserFactory1 browserFactory;
	public ExcelDataProvider excelDataProvider;

	@BeforeSuite
	public void init() {
excelDataProvider= new ExcelDataProvider();
configDataProvider=new ConfigDataProvider();
browserFactory=new BrowserFactory1();

	}
	
	/*driver=BrowserFactory.browserSetUp("chrome","https://www.crmpro.com");*/

@AfterMethod
public void tearDown() {
	browserFactory.quitBrowser();	
}
}