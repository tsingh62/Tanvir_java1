package Selenium_examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositeCalculateExcel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.manage().window().maximize();
 		// Now giving the path of the XLSX sheet data that I prepared for the website 
 		//pass it into a string called path
		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data_Driven_XL_Data_Day21/caldata.xlsx");
 		
 		//Now calling the method from Ultils class and passing the values for path and sheet no
 		// open the Excel file to see the sheet no
 		int rowcount = XLUtiles.getRowCount(path,"Sheet1");
 		
 		// using one for loop for this one - hard coding the values
 		
 		for(int i=1; i<=rowcount; i++)
 			
 		{
 			String pricipleamt = XLUtiles.getCellData(path, "Sheet1", i, 0);
 			String rateofinterest = XLUtiles.getCellData(path, "Sheet1", i, 1);
 			String period = XLUtiles.getCellData(path, "Sheet1", i, 2);
 			String frequency = XLUtiles.getCellData(path, "Sheet1", i, 3);
 			// for string to double 
 			double emp_value = Double.parseDouble(XLUtiles.getCellData(path, "Sheet1", i, 4));
 			
 			// now passing the data into application
 			driver.findElement(By.id("principal")).sendKeys(pricipleamt);
 			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
 			driver.findElement(By.id("tenure")).sendKeys(period);
 			
 			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
 			perdrp.selectByVisibleText("year(s)");
 			
 			Select fredrp=new Select(driver.findElement(By.id("frequency")));
 			fredrp.selectByVisibleText(frequency);
 			
 			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click(); //calculate button
 			
 			// The final value is now checked here the value might change after
 			// every calculation give different  but the x path remains the same 
 			// writing a for loop to validate the result 
 			String act_mvalue = driver.findElement(By.xpath("//*[@id=\\\"resp_matval\\\"]/strong")).getText();
 			// now change the value of string to double
 		//	if(act_mvalue == Double.parseDouble(act_mvalue ))
 			// emp_value is the last col for which shows the maturity value
 				// defined above 
 			if(emp_value==Double.parseDouble(act_mvalue))
 					{
 						System.out.println("Test passed  :");
 					}
 			else
 			{
 				System.out.println("Test failed :");
 			}
 			// clicking on clear button to clear the entetred data
 			driver.findElement(By.xpath("//*[@id=\\\"fdMatVal\\\"]/div[2]/a[2]/img")).click();
 			
 		}
 		
 		driver.quit();
 		
	}

}
