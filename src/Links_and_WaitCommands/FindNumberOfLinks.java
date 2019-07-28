package Links_and_WaitCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindNumberOfLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/"); //driver.navigate().to("http://newtours.demoaut.com/");
		
		List <WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size()); //16
		
		//Reading/extracting link texts fro links
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
		
		
		//How many images are present

		List <WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(images.size()); 
		
	}

}

	