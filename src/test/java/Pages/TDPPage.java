package Pages;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class TDPPage {
	
	WebDriver driver;
	By TDP=By.xpath("//a[text()='135']");
	
	
	public TDPPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void GoToTDPPage() {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2000));
	wait.until(ExpectedConditions.elementToBeClickable(TDP));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//		jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(TDP)); 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(TDP)).click().build().perform();
	}
	
	
}
