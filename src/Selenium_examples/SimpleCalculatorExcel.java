package Selenium_examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleCalculatorExcel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.easycalculation.com/simple-interest.php");
		
		driver.manage().window().maximize();
		
		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data-Driven_XL_Data_Day_22/SIdata.xlsx");
	
		int rowcount=XLUtiles.getRowCount(path, "Sheet1");//NUMBER OF ROWS PRESENT IN A EXCEL SHEET
		
		for(int i=1;i<=rowcount;i++)
		{
			String princ=XLUtiles.getCellData(path, "Sheet1",i,0);
			String rateofinterest=XLUtiles.getCellData(path, "Sheet1",i,1); 
			String time=XLUtiles.getCellData(path, "Sheet1",i,2); 
			// converting string to double
			Double exp_si=Double.parseDouble(XLUtiles.getCellData(path, "Sheet1",i,3));
			
			
			driver.findElement(By.name("res1")).sendKeys(princ);
			driver.findElement(By.name("res2")).sendKeys(rateofinterest);
			driver.findElement(By.name("res3")).sendKeys(time);
			
								
			Select timedrp=new Select(driver.findElement(By.name("time")));
			timedrp.selectByVisibleText("Years");
					
			Thread.sleep(5000);
	//===================Capture a value thats keep changing===//
			// using get attribute as xpath wont work
				// since value of simple interest keeps changing
			String act_si=driver.findElement(By.name("res4")).getAttribute("value"); //capture Simple Interest value
			
			if(exp_si==Double.parseDouble(act_si))
			{
				System.out.println("Test Passed");
				XLUtiles.setCellData(path, "Sheet1", i, 4, "Passed");
							
			}
			else
			{
				System.out.println("Test Failed");
				XLUtiles.setCellData(path, "Sheet1", i, 4, "Failed");
			}
				
			driver.findElement(By.xpath("//*[@id='dispCalcConts']/input[2]")).click(); //reset button
					
			Thread.sleep(3000);
			
		}
		
	}

}
