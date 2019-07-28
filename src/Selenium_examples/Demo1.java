package Selenium_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//	System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
 		
 		driver.manage().window().maximize();
 		
 		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
 		
 				
 		List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
 		
		
 		for(WebElement ele:allDates)
 		{
 			String date=ele.getText();
 			
 			if(date.equalsIgnoreCase("10"))
 			{
 				ele.click();
 				break;
 			}
 		}
 		
 		
	}

}
