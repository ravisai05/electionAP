package StepDefinitions;
import Pages.HomePage;
import Pages.JSPPage;
import Utilites.TextContextSetup;
import io.cucumber.java.en.When;

public class JSPPageStepDefination {

	TextContextSetup textContextSetup;
	public  JSPPageStepDefination (TextContextSetup textContextSetup) {
		// TODO Auto-generated constructor stub
		this.textContextSetup=textContextSetup;
	}

	@When("Click on JSP page")
	public void click_on_jsp_page() {
	    //HomePage hp=textContextSetup.pm.getHomePage();
	   
		 JSPPage jp=textContextSetup.pm.getJSPPage();
		 textContextSetup.gu.SwitchToHomePage();
	    jp.GoT0JSPPage();
	    textContextSetup.gu.readList();
	}
	
}
