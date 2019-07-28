package WebTablesDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable1 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/SeleniumPractice/sample.html");
		
		
		//int rows=driver.findElements(By.tagName("tr")).size();
		int rows=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		// this is the xpath of the whole table with rows
		// using find.elements and not find.element will help get the value of the rows
		
		System.out.println(rows);
		
		
		//int cols=driver.findElements(By.tagName("th")).size();
		int cols=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
		// this is the xpath of the whole table with cols
				// using find.elements and not find.element will help get the value of the cols
		
		System.out.println(cols);
		
	///html/body/table/tbody/tr[2]/td[1]  -- 2, 1
		
		System.out.println("Product"+"   "+"Article"+"    "+"Price");
		
		// r=2 as the 1st row is the header 
		for(int r=2;r<=rows;r++) //2 3 // to increment to row 
		{
			for(int c=1;c<=cols;c++) //1 // to incremnet the cols 
			{
				String value=driver.findElement(By.xpath("/html/body/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			
				System.out.print(value+"    ");//2,1-Product1  2,2 -0001  2,3- 10  3,1 -product...
			}
			System.out.println();//Jump to the next line
		}
		

	}

}
