package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JSPPage {
	WebDriver driver;
	By jsp=By.xpath("//a[text()='21']");
	
	public JSPPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void GoT0JSPPage() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(jsp)).click().build().perform();
		
		
	}
	
	
}
