package Selenium_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class UserRegistrationExcel 
{
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");

		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data_Driven_XL_Data_Day21/Registration.xlsx");

		
		
		int noofrows = XLUtiles.getRowCount(path, "Sheet1");

		for (int row = 1; row <= noofrows; row++) {
			String First_name = XLUtiles.getCellData(path, "Sheet1", row, 0);
			String Last_name = XLUtiles.getCellData(path, "Sheet1", row, 1);
			String phone = XLUtiles.getCellData(path, "Sheet1", row, 2);
			String email = XLUtiles.getCellData(path, "Sheet1", row, 3);
			String address = XLUtiles.getCellData(path, "Sheet1", row, 4);
			String city = XLUtiles.getCellData(path, "Sheet1", row, 5);
			String state = XLUtiles.getCellData(path, "Sheet1", row, 6);
			String pincode = XLUtiles.getCellData(path, "Sheet1", row, 7);
			String country = XLUtiles.getCellData(path, "Sheet1", row, 8);
			String username = XLUtiles.getCellData(path, "Sheet1", row, 9);
			String password = XLUtiles.getCellData(path, "Sheet1", row, 10);

	//		driver.findElement(By.linkText("REGISTER")).click(); // submit button

			// registration process start
			driver.findElement(By.linkText("REGISTER")).click();

			// contact information
			driver.findElement(By.name("firstName")).sendKeys(First_name);
			driver.findElement(By.name("lastName")).sendKeys(Last_name);
			driver.findElement(By.name("phone")).sendKeys(phone);
			driver.findElement(By.name("userName")).sendKeys(email);

			// mailing information
			driver.findElement(By.name("address1")).sendKeys(address);
			driver.findElement(By.name("address2")).sendKeys(address);
			driver.findElement(By.name("city")).sendKeys(city);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("postalCode")).sendKeys(pincode);
			Select dropcountry = new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(country);

			// user information
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("confirmPassword")).sendKeys(password);

			driver.findElement(By.name("register")).click(); // click 

			Thread.sleep(2000);

			// validation

			if (driver.getPageSource().contains("Thank you for registering")) {
				System.out.println(" Registration Completed for  " + row + " record");

			}

			else {
				System.out.println(" Registration Failed for " + row + " record");

			}

		}

	}

}
