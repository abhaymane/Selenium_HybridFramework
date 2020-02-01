package utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
public Properties prop;
public ConfigDataProvider() {
	try {
		FileInputStream fins=new FileInputStream(new File("D:\\Selenium\\Learn_hybridframework\\Config\\config.properties"));
		prop=new Properties();
		prop.load(fins);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
public String getBrowser(String browsername) {
	return prop.getProperty(browsername);
	
}
public String getUrl(String urlName) {
	
	return prop.getProperty(urlName);
}
public String getKey(String keyName) {
	return prop.getProperty(keyName);
}
}
