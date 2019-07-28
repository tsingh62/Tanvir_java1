package TestNGParaDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTC 
{
	WebDriver driver; // driver as global variable 
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test (dataProvider="user")
	void login (String uname, String pwd)
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
		String act_title = driver.getTitle();
		String exp_title="Find a Flight: Mercury Tours:";
		
		Assert.assertEquals(act_title,exp_title);
		
	}
	@DataProvider(name="user")
	String [][] LoginData ()
	{
		String data[][]= { {"mercury","mercury"},{"mer1","mer1"},{"mercury1","mer1"}};
		return data;
	}
	@AfterClass
	void closeBrowser ()
	{
	//	driver.close();
	}

} 
	/*

	@Test(dataProvider="users")
	void loginTest(String uname,String pwd)
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
		String act_title=driver.getTitle();
		String exp_title="Find a Flight: Mercury Tours:";
		
		Assert.assertEquals(act_title, exp_title);
	}
	
	
	@DataProvider(name="users")
	String [][] loginData()
	{
		String data[][]= { {"mercury","mercury"},{"mer1","mer1"},{"mercury1","mer1"}};
		return data;
	}
	
	@AfterClass
	void closeBrowser() 
	{
		driver.close();
	}
}
*/