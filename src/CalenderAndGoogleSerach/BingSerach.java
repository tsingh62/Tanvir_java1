package CalenderAndGoogleSerach;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BingSerach {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C://Drivers/geckodriver-v0.19.1-win64/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	   driver.get("https://www.bing.com/");
	 
	   Thread.sleep(4000);
	   // driver.manage().window().maximize();
	   driver.findElement(By.id("sb_form_q")).sendKeys("java");
	   
	   //List<WebElement> list= driver.findElements(By.xpath("/html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/div/div/ul/li/div")); //working using full xpath
	   List<WebElement> list= driver.findElements(By.xpath("//ul[@id='sa_ul']/li/div")); //working - using partial xpath
	   
	   System.out.println("size of elements"+ list.size());

	   for (int i=0;i<list.size();i++)
	   {
	    System.out.println(list.get(i).getText());
	    if(list.get(i).getText().contains("java update"))
	    {
	     list.get(i).click();
	     break;
	    }
	   }
	}
	}