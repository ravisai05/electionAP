package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.YSRCPPage;
import Utilites.TextContextSetup;
import io.cucumber.java.en.When;

public class YSRCPStepDefination {
	
	WebDriver driver;
	TextContextSetup textContextSetup;
	
	public YSRCPStepDefination(TextContextSetup textContextSetup) {
		this.textContextSetup=textContextSetup;
	}
	
	@When("Click on YSRCP page")
	public void click_on_ysrcp_page() {
	   //HomePage hp=new HomePage(textContextSetup.driver);
	   
	   YSRCPPage yp=textContextSetup.pm.getYSRCPage();
	   textContextSetup.gu.SwitchToHomePage();
	   yp.GoTOYsrcpPage();
	   textContextSetup.gu.readList();
	   
	}
}
