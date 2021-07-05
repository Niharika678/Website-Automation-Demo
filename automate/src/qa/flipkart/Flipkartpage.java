package qa.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Flipkartpage {
	
	public static WebDriver driver;
	
	@Test(priority=1)
	    public void NaviagteToSearch()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://stage.eazme.com");
		
			driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[1]/a")).click();

			driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[1]/div/div/div[1]/ul/li[1]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"load-store\"]/div[1]/div/a")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[3]")).click();
			
			
	}	
			
			}
		
	


	
	

	
	
		


