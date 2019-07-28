package Selenium_examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositeCalculate1Excel {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.manage().window().maximize();
		
		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data_Driven_XL_Data_Day21/caldata.xlsx");
		
		int rowcount=XLUtiles.getRowCount(path, "Sheet1");
		
		for(int i=1;i<=rowcount;i++)
		{
		String pric=XLUtiles.getCellData(path, "Sheet1", i, 0);
		String rateofinterest=XLUtiles.getCellData(path, "Sheet1", i, 1);
		String per=XLUtiles.getCellData(path, "Sheet1", i, 2);
		String fre=XLUtiles.getCellData(path, "Sheet1", i, 3);
		
		double exp_mvalue=Double.parseDouble(XLUtiles.getCellData(path, "Sheet1", i, 4));
		
		driver.findElement(By.id("principal")).sendKeys(pric);
		driver.findElement(By.id("interest")).sendKeys(rateofinterest);
		
		driver.findElement(By.id("tenure")).sendKeys(per);
		Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
		perdrp.selectByVisibleText("year(s)");
		
		Select fredrp=new Select(driver.findElement(By.id("frequency")));
		fredrp.selectByVisibleText(fre);
		
		driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click(); //click
		
		
		String act_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
		
		if(exp_mvalue==Double.parseDouble(act_mvalue))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		
		}
		
		driver.quit();
	}

}
