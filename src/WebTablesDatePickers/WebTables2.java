package WebTablesDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
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
		// x path of all the rows (use of elements)
		int rows=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
		
		int count=0;
		
		for(int r=1;r<=rows;r++)
		{	
			// check for col 5 for enabled and disbled values in that col
			String status=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
		
			if(status.equals("Enabled"))
			{
			count++;	// will have value as to how many times enabled is there
			}
		}
		System.out.println("Number of users enabled:"+count); // count no of enable in that col
		System.out.println("Number of users disabled:"+(rows-count)); // count no of disable in that col
	
		
	}
}


















