package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.TDPPage;
import Utilites.TextContextSetup;
import io.cucumber.java.en.When;

public class TDPPageStepDefination {
	TextContextSetup textContextSetup;
	WebDriver driver;
	public TDPPageStepDefination(TextContextSetup textContextSetup){
		this.textContextSetup=textContextSetup;
	}
	
	@When("Click on TDP Page")
	public void click_on_tdp_page()  {
	   TDPPage tp=textContextSetup.pm.getTdpPage();
	   
	  
	   tp.GoToTDPPage();
	   textContextSetup.gu.readList();
	   
	}
}
