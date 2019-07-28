package Actions_Class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		//	Appraoch1:
		//js.executeScript("window.scrollBy(0,4000)", "");
		
		
		//Appraoch2: Scroll down to an image or object - here the xpath is the path of the flag
		
		//WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		//js.executeScript("arguments[0].scrollIntoView();", flag);
	
		//Apprach3:
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
