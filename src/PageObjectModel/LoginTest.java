package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://newtours.demoaut.com/");
		
	}
	@Test
	void login()
	{
		LoginPage LP = new LoginPage(driver);
		LP.setusername("mercury");
		LP.setPassword("mercury");
		LP.clickSubmit();
		//validation
		// get title of the page
		// and check with assertion
		
	}
	@AfterClass()
	void teardown()
	{
		driver.close();
	}
	
	

}
