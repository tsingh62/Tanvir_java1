package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationMethodDemo 
{
	
	// Since in the Test case 
	// login happens before every Test case i.e. before Search/ advanced search/ pre-paid/post-paid
	// We need to use this method multiple time 
	// So we use the @BeforeMethod annotation to use is before the above mentioned methods
	@BeforeMethod
		void login()
	{
		//code for login
		System.out.println("This is login Test....: ");
	}

	@Test (priority=1)
	void search()
	{
		// Code for open URL
		System.out.println("This is search test....: ");
	}
	
	@Test (priority=2)
	void advancedSearch()
	{
		// Code for open URL
		System.out.println("This is adv srearch Test....: ");
	}
	
	@Test (priority=3)
	void prepaid()
	{
		System.out.println("This is prepaid Test....: ");
	}
	
	@Test (priority=4)
	void postpaid()
	{
		System.out.println("This is postpaid Test....: ");
	}

	// Since in the Test case 
	// log out  happens after every Test case i.e. before Search/ advanced search/ pre-paid/post-paid
	// We need to use this method multiple time 
	// So we use the @AfterMethod annotation to use is after the above mentioned methods
	@AfterMethod
	void logOut()
	{
		// code for log out
		System.out.println("This is log out Test....: ");
	}
	
	// for this test Before Test is in AnnotationMethodDemo1.java
	// Does not matter where you put this method
		// After Test will execute after all the test cases are run
			// after the execution of all the classes and methods
		@AfterTest
		void ABC()
		{
			System.out.println("After Test method Test :");
		}
}
