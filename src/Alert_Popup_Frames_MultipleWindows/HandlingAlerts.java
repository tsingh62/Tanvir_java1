package Alert_Popup_Frames_MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/"); 
		
		driver.manage().window().maximize();
		
		// click on button to open pop up
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();//click on button
		
		Thread.sleep(5000);
		
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		
		//Validating OK button - in pop up window
		driver.switchTo().alert().accept();
		
		// validating the message
		// xpath of the message
		String act_msg=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		String exp_ms="You pressed OK!";
		
		if(act_msg.equals(exp_ms))
		{
			System.out.println("Test passed for OK button");
		}
		else
		{
			System.out.println("Test Failed for OK button");
		}
		
		Thread.sleep(5000);
		
		//Validating Cancel button
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();//click on button
		
		Thread.sleep(5000);
		
				driver.switchTo().alert().dismiss();
				
				act_msg=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
				exp_ms="You pressed Cancel!";
							
				
				if(act_msg.equals(exp_ms))
				{
					System.out.println("Test passed for Cancel button");
				}
				else
				{
					System.out.println("Test Failed for Cancel button");
				}
		
		driver.close();
		

	}

}
