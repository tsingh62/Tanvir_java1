package CalenderAndGoogleSerach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSerach { // See day18 video to get more info

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
 		driver.get("https://www.google.com/");

 		driver.manage().window().maximize();
 		
 		// This is the name id for the "Google text box"
 		driver.findElement(By.name("q")).sendKeys("java");
 		Thread.sleep(10000);
 		
 		// - //ul[@role='listbox'] is the xpath of the entire display box
 		// showing all the options in a list when we type in Java
 		// under Ul we have li
 		// - li is the list 
 		// - descendant with two div so we use ::
 		// here the ul has a role attribute with value listbox
 		
 		// - div[@class='sbl1'] here this logic is taken as there are 2 div
 		// the 2nd div has a class that is common in all the list values displayed
 		// when we check inside every 2ndiv we find this clas name is common so we select it
 		// sbl1 is constant in all li 
 		List <WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
	
 		System.out.println(list.size());
	
 		for(WebElement li:list)
 		{
 			if(li.getText().contains("java jdk"))
 			{
 				li.click();
 				break;
 			}
 		} // - //ul[@role="listbox"]/li - this code by me works as well [//ul+li gives the list]
	
	 // - //ul[@role='listbox']/li/descendant::div[@class='sbl1'] // This code by Pavan works
		// -this goes into the detail when you use the logic of descendants 

	
}
}

// - //body/div[@class='wrapper']/div[@class='container']/div[1]/div[1]/div[1]

// - /html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td
// -/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr/td