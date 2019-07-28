package Alert_Popup_Frames_MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index"); 
					
		//first frame - packageListFrame
		driver.switchTo().frame("packageListFrame");//switch to first frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent(); // go back and focus web page
		
		Thread.sleep(5000);
		 
		//2nd frme - packageFrame
		driver.switchTo().frame("packageFrame");//switch to second frame
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent(); // go back and focus web page
		
		Thread.sleep(5000);
		
		//3rd frame - classFrame
		driver.switchTo().frame("classFrame");//switch to third frame
		driver.findElement(By.linkText("ChromeDriver")).click();
		

	}

}
