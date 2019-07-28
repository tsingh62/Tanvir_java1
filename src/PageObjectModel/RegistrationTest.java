package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	void userRegistration()
	{
		RegistrationPage RGPage=new RegistrationPage(driver);
		RGPage.clickRegLink();
		
		RGPage.setFirstName("Tavnir");
		RGPage.setLastName("Singh");
		RGPage.setPhone("8142402254");
		RGPage.setemail("tsingh@gmail.com");
		RGPage.setAddress1("Nizampet");
		RGPage.setAddress2("Kukatpally");
		RGPage.setCity("HYDERABAD");
		RGPage.setState("AP");
		RGPage.setPostalCode("500074");

		RGPage.setCountry("INDIA");

		RGPage.setUserName("TANVIR");
		RGPage.setPassword("tanvir");
		RGPage.setConfirmedPassword("tanvir");

		RGPage.clickRegBtn();
		
		// Validation

				if (driver.getPageSource().contains("Thank you for registering")) {
					Assert.assertTrue(true);
				}

				else

				{
					Assert.fail();
				}
		
	}
	
	
}
