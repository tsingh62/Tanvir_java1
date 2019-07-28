package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationMethodDemo1 
{
	// for this test Before Test is in AnnotationMethodDemo.java
	// Does not matter where you put this method
	// Before Test will execute before all the test cases are run
		// before any class or any method
	@BeforeTest
	void XYZ()
	{
		System.out.println("Before Test method Test :");
	}
	
	
	
	// Since in the Test case 
	// login should execute only once i.e. before Search/ advanced search/ pre-paid/post-paid
	// We need to use this method as we want Login to execute once
	// So we use the @BeforeClass annotation to use is before the above mentioned methods

	@BeforeClass
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
		// logout should execute only once i.e. before Search/ advanced search/ pre-paid/post-paid
		// We need to use this method as we want use Logout to execute once
		// So we use the @AfterClass annotation to use is after the above mentioned methods
	@AfterClass
	void logOut()
	{
		// code for log out
		System.out.println("This is log out Test....: ");
	}

}
