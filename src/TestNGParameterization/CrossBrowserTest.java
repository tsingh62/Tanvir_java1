package TestNGParameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters("browser")
	public void launchBrowser(String br) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		// another another else if for Internet explorer
		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(10000);
	}

	@Test(priority=2)
	public void verifyTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals("Welcome: Mercury Tours", title);
	}
	
	@Test(priority=3)
	public void registration()
	{
		//write the webdriver code to perform registration....
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	public void closeBrowwser()
	{
		driver.close();
	}
}
