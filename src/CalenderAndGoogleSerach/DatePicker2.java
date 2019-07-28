package CalenderAndGoogleSerach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker2 { // Look at day18 video for more info

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
 		driver.get("https://testautomationpractice.blogspot.com/");
 		driver.manage().window().maximize();
 		
 		// This is the x-path for the date-picker / Calendar 
 		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
 		
 				
 		List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
 		// - //table[@class='ui-datepicker-calendar'] is the x path of the calendar +
 		// - the rows and col values next
		// - //div[@class="ui-date picker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"]//td
 	// vip - 	//- here we need to remove /tr/td/a[1] = tr and a[1] and just keep td
 		// always check the logic for calendar not the same always 
 		
 		
 		// Pass the x path of the calendar into a web element 
 		// then read the elements in ele
 		for(WebElement ele:allDates)
 		{	
 			// pass the values into a string and the value using getText
 			String date=ele.getText();
 			
 			// State the date we need in the calendar 
 			if(date.equalsIgnoreCase("10"))
 			{
 				// click the date we need 
 				ele.click();
 				break; // once the date is selected get out of the loop
 			}
 		}
 		
 		
	}

}
