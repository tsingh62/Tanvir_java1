  package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //maximize your browser
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin-->Usermanagement-->Users
		Thread.sleep(2000);
	//	WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement admin=driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
	
	//	WebElement usermng=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")); 
		WebElement usermng=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		
		
	//	WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		WebElement users=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		Actions act=new Actions(driver);	
		Thread.sleep(10000); // worked after this thread input
		act.moveToElement(admin).moveToElement(usermng).moveToElement(users).click().build().perform();
		
	
	}

}






