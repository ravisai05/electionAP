package StepDefinitions;

import java.io.IOException;

import Utilites.TextContextSetup;
import io.cucumber.java.After;

public class Hooks {
public TextContextSetup textContextSetup;
	public Hooks(TextContextSetup textContextSetup) {
		// TODO Auto-generated constructor stub
		this.textContextSetup=textContextSetup;
	}
	@After
	public void  TearDown() throws IOException {
	
		textContextSetup.testbase.WebDriverManagers().quit();
	}
}
