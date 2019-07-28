package Links_and_WaitCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,10000);
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); //Page Load time
		
		driver.get("http://newtours.demoaut.com/");
		
		
		WebElement useraname=mywait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		useraname.sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		
		WebElement radiobutton=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='oneway']")));
		radiobutton.click();

	}

}
