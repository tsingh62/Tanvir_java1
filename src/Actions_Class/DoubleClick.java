package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); //switch to frame where exactly the element is present

		WebElement ele=driver.findElement(By.xpath("/html/body/div"));//captured element
		Actions act=new Actions(driver);
		
		Thread.sleep(5000);
								// For loop not really needed just for example
		for(int i=1;i<50;i++) // for loop to perform <50 double clicks on the element 
		{
		act.doubleClick(ele).build().perform(); //Double click on element
		}
	}

}
