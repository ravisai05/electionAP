package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class YSRCPPage {

	By ysrcp=By.xpath("//a[text()='11']");
	WebDriver driver;
	
	public YSRCPPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void GoTOYsrcpPage() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(ysrcp)).click().build().perform();
		
	}
	
}
