package TestNGGrouping;

import org.testng.annotations.Test;

/* 
LoginByemail - sanity
loginByfacebook - sanity
loginBytwitter - sanity */

public class TC1 
{
	@Test (priority=1, groups = {"sanity"})
	public void loginByEmail()
	{
		System.out.println("login by email......");
	}
	@Test (priority=2, groups = {"sanity"})
	public void loginByFacbook()
	{
		System.out.println("login by faceBook......");
	}
	@Test (priority=3, groups = {"sanity"})
	public void loginByTwitter()
	{
		System.out.println("login by Twitter......");
	}
	
	

}
