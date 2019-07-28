package Selenium_examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTTestLoginExcel {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data-Driven_XL_Data_Day_22/Login1.xlsx");

		int row = XLUtiles.getRowCount(path, "sheet1");
		
		for (int i=1; i<=row;i++)
		{
			String username = XLUtiles.getCellData(path, "sheet1", i, 0);
			String password = XLUtiles.getCellData(path, "sheet1", i, 1);
			
			// Now sending these values to the web-site
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			// Login after typing in the password
			driver.findElement(By.name("login")).click();
			
			
			// Now validating the message if the test has passed or failed
			// as in the Excel sheet only the first row has the correct data
			// the data in the other rows are in-correct
			
			 String exp_title = "Find a Flight: Mercury Tours:";
			 String act_title = driver.getTitle();
			 if(exp_title.equals(act_title))
			 {
				 System.out.println("Test Passed");
				 // Now we need to pass the result value into the excel sheet
				 // under result which is left empty
				 XLUtiles.setCellData(path, "sheet1", i, 2, "Login Passed"); // Col = 2 since index no starts from 0
			 }
			 else
			 {
				 System.out.println("Test Failed");
				 XLUtiles.setCellData(path, "sheet1", i, 2, "Login failed");// Col = 2 since index no starts from 0
			 }
		// clicking on home button
			 driver.findElement(By.linkText("Home")).click();
		
		}
		driver.close();
		
	}

}
