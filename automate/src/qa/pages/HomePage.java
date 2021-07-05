package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="/html/body/div[1]/nav/div/ul/li[1]/a")
	WebElement Categories;
	@FindBy(xpath="/html/body/div[1]/nav/div/ul/li[1]/div/div/div[1]/ul/li[1]/a")
	WebElement Electronis;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void click_categories()  {
		//driver.switchTo().frame(0);
		Actions act= new Actions(driver);
		act.moveToElement(Categories).build().perform();
		//Thread.sleep(3000);
		
	}
	
	public void click_Electronics() {
		Electronis.click();
		//Thread.sleep(5000);
		
	}
	
	

}
