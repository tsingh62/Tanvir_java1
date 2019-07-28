package TestNG;

import org.testng.annotations.Test;

public class DemoFISRSTest 
{
	// If priority is not given @Test annotation will execute
	// methods in alphabetical order
	
	@Test (priority=1)
	void openURL()
	{
		// Code for open URL
		System.out.println("This is openURL method....: ");
	}
	@Test (priority=2)
	void login()
	{
		//code for login
		System.out.println("This is login method....: ");
	}
	@Test (priority=3)
	void logOut()
	{
		// code for log out
		System.out.println("This is log out method....: ");
	}

}
