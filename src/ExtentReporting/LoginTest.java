package ExtentReporting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	
	WebDriver driver;
	
	@Test(priority=1)
	void loginTest () throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	
	@Test(priority=2)
	void CheckNoofEmployees()
	{
		Assert.assertTrue(true); // made this method to pass value true
	}
	@Test(priority=3, dependsOnMethods= {"loginTest"})
	void CheckNoofEmplayeesEnabled()
	{
		Assert.assertTrue(true);
		
	}
	@AfterClass
	void closeBrowser()
	{
		driver.quit();
	}
	
	
	// Now implementing the screen shot logic where the screen shot would be taken only when 
	// the method fails 
	
	@AfterMethod // It will capture a screen shot after every method
					// as after method runs multiple times after every method
	public void captureScreen(ITestResult result) throws IOException 
	{// ITestResult to take the screen shot after every Test
	
	if(result.getStatus()==ITestResult.FAILURE)
		//the object result contains the result of the test methods executed
		//if the test fails it would take a screen shot
	{
		// Code for Taking screen shot starts from here 
				// pre defined class TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		//Take a screen shot and store it in a FIle variable 
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// Now setting the location where the file will be saved
		//create you own file name example for this case
		
		// here we make a folder screenshot under the project name Tanvir_Java1
		// user.dir gets the current project dir 
		// + the folder name that is screenshot + 
	
		File trg = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+result.getName()+".png");
		// result contains all the information about the previous method
		//.getName() will get the name of the test method so it saves the screenshot
		//of the test method name
		
		// Puts the screen shot taken into a variable to a target place
		FileUtils.copyFile(src, trg);
		
	}
		
	}
	
	
	
	
}
