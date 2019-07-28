package Alert_Popup_Frames_MultipleWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertwithInputBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		// Click drop down
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			
		// click to select alert with text
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		// switch to pop up
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		// sending the values in the text field of the pop up
		alert.sendKeys("pavan");// provide the value in to input box
		alert.accept(); //close alert box by using ok button
		
		Thread.sleep(5000);
		
		// Validating the message after selecting ok button on the pop up window
		String act_msg=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if(act_msg.contains("pavan"))
		{
			System.out.println("Test passed.....");
		}
		else
		{
			System.out.println("Test failed.....");
		}
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
