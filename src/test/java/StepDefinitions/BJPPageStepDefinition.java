package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.BJPPage;
import Utilites.TextContextSetup;
import io.cucumber.java.en.When;

public class BJPPageStepDefinition {

	public WebDriver driver;
	public BJPPage bj;
	TextContextSetup textontextSetup;
	public BJPPageStepDefinition(TextContextSetup textontextSetup) {
		// TODO Auto-generated constructor stub
		this.textontextSetup=textontextSetup;
	}
	@When("click on BJP Page")
	public void click_on_bjp_page() {
	    bj = textontextSetup.pm.getBJPPage();
	    textontextSetup.gu.SwitchToHomePage();
	    bj.GoT0BJPPage();
	    textontextSetup.gu.readList();
	}
}
