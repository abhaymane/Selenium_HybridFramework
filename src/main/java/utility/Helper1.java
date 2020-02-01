package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Helper1 {
	public void switchToIFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
		
	}
	public void switchToIFrame(WebDriver driver,String name) {
		driver.switchTo().frame(name);
	}
	public void switchToIFrame(String id,WebDriver driver) {
		driver.switchTo().frame(id);
	}
	public void switchToIFrame(WebElement ele,WebDriver driver) {
		driver.switchTo().frame(ele);
	}
	public void switchToIFrame(WebDriver driver) {
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}
	//capture screenshot method
	public void captureScreenShots(WebDriver driver,String screenshotName) {
		try {
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File(".//Screenshot//crmpro_"+getCurrentDateTime()+"_"+screenshotName+".png"));
			System.out.println("screen captured");
		}
		catch(Exception e) {
			System.out.println("screenshot is not captured");
			e.printStackTrace();
		}
		
	}
	public static String getCurrentDateTime() {
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
		
		
	}
	public static void mouseHoverAndClickActions(WebDriver driver,WebElement ele,WebElement ele1) {
		new Actions(driver).moveToElement(ele).moveToElement(ele1).click().build().perform();
	}

}
