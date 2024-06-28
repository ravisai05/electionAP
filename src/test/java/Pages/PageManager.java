package Pages;

import org.openqa.selenium.WebDriver;

public class PageManager {

	public WebDriver driver;
	public HomePage homePage;
	public JSPPage jspPage;
	public YSRCPPage ysrcpPage;
	public TDPPage tdpPage;
	public 	BJPPage 	BjpPage;
	public PageManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
	public JSPPage getJSPPage() {
		jspPage=new JSPPage(driver);
		return jspPage;
	}
	public YSRCPPage getYSRCPage() {
		ysrcpPage=new YSRCPPage(driver);
		return ysrcpPage;
	}
	public TDPPage getTdpPage() {
		tdpPage=new TDPPage(driver);
		return tdpPage;
	}
	public BJPPage getBJPPage() {
	 BjpPage = new BJPPage(driver);
		return BjpPage;
	}
}
