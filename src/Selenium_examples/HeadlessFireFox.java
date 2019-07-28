package Selenium_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFireFox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		// does not open the browser
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		
		
		driver.get("http://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}

	


