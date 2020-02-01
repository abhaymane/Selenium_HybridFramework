package testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory2;
import utility.ConfigDataProvider;
import utility.ExcelDataProvider1;
import utility.Helper;

public class Testbase2 {
	public ConfigDataProvider configDataProvider;
	public BrowserFactory2 browserFactory;
	public ExcelDataProvider1 excelDataProvider;
	public Helper helper;

	@BeforeSuite
	public void init() {
		helper=new Helper();
excelDataProvider= new ExcelDataProvider1();
configDataProvider=new ConfigDataProvider();
browserFactory=new BrowserFactory2();

	}
	
	/*driver=BrowserFactory.browserSetUp("chrome","https://www.crmpro.com");*/

@AfterMethod
public void tearDown() {
	browserFactory.quitBrowser();	
}

}
