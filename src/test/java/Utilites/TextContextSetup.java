package Utilites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.PageManager;

public class TextContextSetup {

	public WebDriver driver;
	int count=0;
	public PageManager pm;
	public TestBase testbase;
	public GenricUtilites gu;
	public String parent;
	public String child;
	public TextContextSetup() throws IOException {
		// TODO Auto-generated constructor stub
		testbase=new TestBase() ;
		pm=new PageManager(testbase.WebDriverManagers());
		gu=new GenricUtilites(testbase.WebDriverManagers());
		
	}
}
