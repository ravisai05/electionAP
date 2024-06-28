package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Utilites.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class HomePageStepDefination {


	public WebDriver driver;
	TextContextSetup textContextSetup;
	public HomePageStepDefination(TextContextSetup textContextSetup) {
		// TODO Auto-generated constructor stub
		this.textContextSetup=textContextSetup;
	}
	@Given("User is on AP Election Page")
	public void user_is_on_ap_election_page() throws IOException {
		textContextSetup.testbase.WebDriverManagers();
		
	}

	@Then("Verify total number of details of canditates displayed")
	public void verify_total_number_of_details_of_canditates_displayed() {
//		HomePage hp=new HomePage(textContextSetup.driver);
		HomePage hp=textContextSetup.pm.getHomePage();
	    textContextSetup.gu.SwitchToHomePage();
	}
	
}
