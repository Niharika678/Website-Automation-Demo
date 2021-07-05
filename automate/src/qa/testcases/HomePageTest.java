package qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		String url="https://stage.eazme.com/in/en";
	    driver_initialization("chrome", url);
	    homepage= new HomePage();
	}
	
	@Test(priority=1)
	public void NaviagteToElectronic()  {
		homepage.click_categories();
		homepage.click_Electronics();
		
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
