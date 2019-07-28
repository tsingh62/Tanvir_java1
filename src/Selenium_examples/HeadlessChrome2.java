package Selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
	
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //maximize your browser
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin-->Usermanagement-->Users
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();//Admin
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click(); //Usermanagement
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
		
		//Table started here
		int rows=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
		
		int count=0;
		
		for(int r=1;r<=rows;r++)
		{
			String status=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
		
			if(status.equals("Enabled"))
			{
			count++;	
			}
		}
		System.out.println("Number of users enabled:"+count);
		System.out.println("Number of users disabled:"+(rows-count));
	
		
	}

}










