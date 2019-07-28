package TestNGDependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethodDemo 
{
	// if the source dependent method fails the depending method is skipped
	
	@Test (priority=1)
	void OpenURL()
	{
		System.out.println("URL test : ");
		Assert.assertTrue(false);
	}
	

	@Test (priority=2, dependsOnMethods= {"OpenURL"})
		void login()
	{
		//code for login
		System.out.println("This is login Test....: ");
		Assert.assertTrue(true);
	}

	@Test (priority=3,dependsOnMethods= {"login"})
	void search()
	{
		// Code for open URL
		System.out.println("This is search test....: ");
		Assert.assertTrue(true);//
	}
	// use of multiple dependency 
	@Test (priority=4,dependsOnMethods= {"login","search"})
	void advancedSearch()
	{
		
		System.out.println("This is adv srearch Test....: "); // Skipped
		Assert.assertTrue(true);
	}
	
	@Test (priority=5, dependsOnMethods= {"login"})
	void logOut()
	{
		// code for log out
		System.out.println("This is log out Test....: ");
		Assert.assertTrue(true);
	}

}
