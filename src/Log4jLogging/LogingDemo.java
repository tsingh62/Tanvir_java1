package Log4jLogging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* 5 types of logs
 * DEBUG
 * INFO - threshold
 * WARN - seen
 * ERROR
 * FATAL - seen
 * */
public class LogingDemo 
{
	WebDriver driver; // Global variable 
	
	Logger logger; // import from apache lo4j
	
	@BeforeClass
	public void setup()
	{
		// logger
		logger=Logger.getLogger("LogingDemo");  // Specify test case name // loggingDemo is the test case
		PropertyConfigurator.configure("log4j.properties");// refer log4j properties location here 
															// using this special class property configurator 
		logger.setLevel(Level.DEBUG);
		
		
		logger.debug("dedub logging is started.........");
		
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		//instantiation of driver 
		
		logger.warn("opening browser is delaying...");
		
		logger.info("opening application URL.....");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// for every activity that we do we need to add some msg to the log file
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/"))
		{
			logger.info("application URL opened......");
		}
		else
		{
			logger.fatal("URL is not openined...blocked....");
		}
		
		logger.debug("setup method is completed...........");
	
	}
	
	@Test
	public void login()
	{
		
		logger.debug("login test is started...........");
		logger.info("providing user name in to user name text box...");
		
		try
		{
		driver.findElement(By.name("txtUsernam")).sendKeys("Admin");
		}
		catch(Exception e)
		{
			logger.error("user name element not found on th aweb page......");
		}
		
		logger.info("providing password into password text box...");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		logger.info("clicking on submit buttton");
		driver.findElement(By.name("Submit")).click();
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			logger.info("test is passed.....");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("test is failed.....");
			Assert.assertTrue(false);
		}
		
		logger.debug("login test is completed...........");
	}
	
	@AfterClass
	public void tearDown()
	{
		logger.debug("application closed..............");
		driver.close();
	}
	
}
