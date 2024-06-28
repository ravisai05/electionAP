package Utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManagers() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				driver.get(prop.getProperty("qa_url"));
				 driver.manage().window().maximize();
			}
			
		}
		return driver;
	}
}
