package Utilites;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenricUtilites {

	By table=By.xpath("//tbody/tr");
	public WebDriver driver;
	public GenricUtilites(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void SwitchToHomePage() {
		
			this.driver.get("https://results.eci.gov.in/AcResultGenJune2024/partywiseresult-S01.htm");
		
	}
	public void readList() {
		List<WebElement> listOfElements = driver.findElements(table);
		System.out.println(listOfElements.size());
		for(int i=1;i<=listOfElements.size();i++) {
			String s=Integer.toString(i);
			for(int j=1;j<7;j++) {
				String t=Integer.toString(j);
				System.out.print(driver.findElement(By.xpath("//tbody/tr["+s+"]/td["+t+"]")).getText() + "    ");
			}
			System.out.println();
			
		}
	}
}
