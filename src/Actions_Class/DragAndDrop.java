package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	driver.manage().window().maximize();
	
	
	WebElement source_ele=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
	WebElement target_ele=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(source_ele, target_ele).build().perform();//DRAG AND DROP

}

}
