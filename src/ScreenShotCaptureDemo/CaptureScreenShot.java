package ScreenShotCaptureDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot 
{
	@Test
	void captureScreen () throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
	
	// Code for Taking screen shot starts from here 
		// pre defined class TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver; // create an object 
		//Take a screen shot and store it in a FIle variable 
		File src = ts.getScreenshotAs(OutputType.FILE);
	// Now setting the location where the file will be saved
		//create you own file name example for this case
		File trg = new File("C://Users//Tanvir Singh//Desktop//Drivers//Eclipse_ScreenShots/google.png");
		// Puts the screen shot taken into a variable to a target place
		FileUtils.copyFile(src, trg);
		
	
	}
	

}
