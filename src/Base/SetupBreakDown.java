package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SetupBreakDown {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuit() {	
		   
		  System.setProperty("webdriver.chrome.driver", "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Drivers/chromedriver");
		  driver =new ChromeDriver();
		  driver.get("http://localhost/orangehrm-4.3/symfony/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  

	}
	
	@AfterSuite
	public void afterSuite() {
		//driver.quit();
	}

}
