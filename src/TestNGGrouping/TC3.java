package TestNGGrouping;

import org.testng.annotations.Test;
/* 
signupByemail - sanity, regression
signupByfacebook - sanity , regression
signupBytwitter - sanity, regression
 */

public class TC3 
{
	@Test(priority=4, groups= {"sanity","regression"})
	public void signupbyemail()
	{
		System.out.println("signup by email");
	}
	
	@Test(priority=5,groups= {"sanity","regression"})
	public void signupbyfacebook()
	{
		System.out.println("signup by facebbok");
	}
	
	@Test(priority=6,groups= {"sanity","regression"})
	public void signupbytwitter()
	{
		System.out.println("signup by twitter");
	}
	
	
}

