package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);// switch to frame
		
		// Old xpath 
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		// New xpath - works, As of now :)
		WebElement ele=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).dragAndDropBy(ele, 150, 250).build().perform();

		Thread.sleep(10000);
		
		//driver.close();
		
	}

}
