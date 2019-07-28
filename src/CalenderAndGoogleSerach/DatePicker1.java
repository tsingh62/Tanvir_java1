package CalenderAndGoogleSerach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker1 { // Check day 18 video for more info

	public static void main(String[] args) throws InterruptedException 
	{
		String month="June 2019";
		String day="30";
		
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		// X-path for the box 
		// When we click in this box the calendar opens 
		driver.findElement(By.xpath("//*[@id=\"dpd1\"]")).click(); //Click on date picker
		Thread.sleep(2000);
		

		while(true) // Whenever the condition is true the while loop will execute
			
		{	// This is the x-path of the current month 
			String text=driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr/th[2]")).getText();
																	// Get Text gets you the text value in the x-path
			System.out.println(text);
			
			if(text.equals(month)) // Since in the calendar the month and year are given as one 
			{	// if the month/year equals the month value given above the loop will end with break command
				break;
			}
			else
			{	// This is the x-path of the "next" <arrow> button for month/year
				driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		
		}
	Thread.sleep(2000);
	// Selecting the particular date // since the date we want it 30 this code will check for that date with +day+ logic
	// This logic captures all the rows and all the cols in the calendar to get the required number
	driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/tbody/tr/td[contains(text(),"+day+")]")).click();
		// - //div[@class='datepicker dropdown-menu'] - this is the xpath for the date picker
				// This is the xpath of the full calendar with the header as well - we need to search for it 
		// Then from /div/table/tbody/tr/td[contains(text(),"+day+") we add this to the above code
			// this is the 2nd half of the xpath of any value taken from the calender 
				// - //div[@class='datepicker dropdown-menu'] +
				// -/html[1]/body[1]/div[9]/div[1]/table[1]/tbody[1]/tr[5]/td[1] - remove 5 and 1 and their brackets
				// =====
				// - //div[@class="datepicker dropdown-menu"]/div[1]/table[1]/tbody[1]/tr/td
				//- //div[@class="datepicker dropdown-menu"]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"20")] - this is also correct
				//- //div[@class="datepicker dropdown-menu"]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]
		// remove the values of tr and td and add the logic = [contains(text(),"+day+")]
	} 

}

// - //div[@class="datepicker dropdown-menu"]
