package TestNGListeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//if we do not want to use XML to link to listener class
	// We can also link to listeners class by using 
	// @Listeners(packagename.classname.class)

//@Listeners(TestNGListeners.ListernerClass.class)
				
public class LoginTest
{	
	@Test
	void setup()
	{
		Assert.fail(); // made to fail
	}
	@Test 
	void loginByEmail() 
	{
		Assert.assertTrue(true);// made to pass
	}
	@Test (dependsOnMethods= {"setup"})
	void loginByFacebook()
	{ 
		Assert.assertTrue(true);// made to pass
	}
	
}
