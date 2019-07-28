package TestNGGrouping;

import org.testng.annotations.Test;
/* 
LoginByemail - sanity
loginByfacebook - sanity
loginBytwitter - sanity

signupByemail - sanity, regression
signupByfacebook - sanity , regression
signupBytwitter - sanity, regression

paymentReturnbybank - regression
payementindollar - regression
payementinrupees - regression  */

public class GroupingDemo 
{
	// Grouping methods
	// we need to use the group annotation 
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
	@Test (priority=4, groups = {"sanity","regression"})
	public void signupByemail()
	{
		System.out.println("Sign up by email......");
	}
	@Test (priority=5, groups= {"sanity", "regression"})
	public void signupByFacebook()
	{
		System.out.println("Sign up by Facebook......");
	}
	@Test (priority=6, groups = {"sanity","regression"})
	public void signupByTwitter()
	{
		System.out.println("Sign up by Twitter......");
	}
	@Test (priority=7, groups = {"regression"})
	public void paymentReturnsByBank()
	{
		System.out.println("Payment returns by bank.....");
	}
	@Test (priority=8, groups = {"regression"})
	public void paymentinDollars()
	{
		System.out.println("payment in dollars......");
	}
	@Test (priority=9, groups = {"regression"})
	public void paymentinRupees()
	{
		System.out.println("payment in Rupees......");
	}
}
