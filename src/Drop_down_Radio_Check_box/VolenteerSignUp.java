package Drop_down_Radio_Check_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VolenteerSignUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		
		//System.out.println("Title of the page:"+ driver.getTitle());
		//System.out.println("URL of the web page:" +driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("John");//Firstname
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Caneddy"); //Lastname
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("123456787");//Phone
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Canada");//Country
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Toronto");//City
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("johncaneedy@gmail.com");//email
		
		
		//Drop-down box
		
		//WebElement ele=driver.findElement(By.id("RESULT_RadioButton-7"));
		
		// This is the id of the drop down (click to open the list)
		Select dropdown=new Select(driver.findElement(By.id("RESULT_RadioButton-7")));
		
		//Find how many options present in drop down
			int noOfOprions=dropdown.getOptions().size();
			System.out.println(noOfOprions);//4
		
		//Extract all the options and print them
			
			List <WebElement> options=dropdown.getOptions();
			
			for(WebElement e:options)
			{
				System.out.println(e.getText());
			}
			
		//Select option from dropdown
			//dropdown.selectByVisibleText("Evening"); //visible text
			//dropdown.selectByIndex(2); //Afternoon   //index
			dropdown.selectByValue("Radio-0");  //value Mornign
			
			
		//Radio buttons
			
			WebElement rad_male=driver.findElement(By.cssSelector("input#RESULT_RadioButton-8_0"));//male
			
			System.out.println(rad_male.isDisplayed());
			System.out.println(rad_male.isEnabled()); //true
			
			System.out.println("status of radio button Before selected:"+rad_male.isSelected()); //false
			
			rad_male.click(); //select radio button
			
			System.out.println("status of radio button After selected:"+rad_male.isSelected()); //true
			
		//Check box
			
			
			WebElement chk_sun=driver.findElement(By.cssSelector("input#RESULT_CheckBox-9_0"));
			
			System.out.println("status of check box before selecting:"+chk_sun.isSelected());
			
			chk_sun.click();
			System.out.println("status of check box After selecting:"+chk_sun.isSelected());
			
			
			
			WebElement chk_sat=driver.findElement(By.cssSelector("input#RESULT_CheckBox-9_6"));
			chk_sat.click();
			
			
			//Text area
			driver.findElement(By.xpath("//*[@id='RESULT_TextArea-12']")).sendKeys("Testing......");
			
			
			
			//Links
			driver.findElement(By.linkText("Software Testing Tutorials")).click();//1 st link
			Thread.sleep(3000);
			
			driver.navigate().back(); // go back to your previous page
			
			driver.findElement(By.partialLinkText("Tools Training")).click(); //2 nd link
			Thread.sleep(3000);
			
			driver.navigate().back(); // go back to your previous page
			
			driver.navigate().forward(); // go back to your previous page
			
			driver.navigate().refresh(); //refresh you r page
			
			
		//driver.close();
		//driver.quit();
	}

}
