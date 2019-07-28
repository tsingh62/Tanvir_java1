package TestNGGrouping;

import org.testng.annotations.Test;


/* 

paymentReturnbybank - regression
payementindollar - regression
payementinrupees - regression  */

public class TC2 
{
	@Test(priority=7, groups= {"regression"})
	public void paymentReturnbybank()
	{
		System.out.println("payment return by bank");
	}
	
	@Test(priority=8,groups= {"regression"})
	public void payementindollar()
	{
		System.out.println("this is payement by dollar method");
	}
	
	@Test(priority=9,groups= {"regression"})
	public void payementinrupees()
	{
		System.out.println("this is payement by rupees method");
	}
	
}



