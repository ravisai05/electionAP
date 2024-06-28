package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BJPPage {

	By BJP=By.xpath("//a[text()='8']");
	WebDriver driver;
	public BJPPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void GoT0BJPPage() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(BJP)).click().build().perform();
		
		
	}
}
