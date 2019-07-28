package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(ele).build().perform(); //right click action
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); //click on copy option
		
		Thread.sleep(5000);
		//handling alert
		// Copying the text on the Alert window
		Alert a=driver.switchTo().alert();
		System.out.println("Text present on alert windows is:--->" +a.getText()); //capture text present on alert
		a.accept();//closes alert

	}

}
