package TestNGParameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameterization 
{
	@Test(priority =1)
	@Parameters("a")
	// the parameter value defined in XML
	// will put the value of a which is welcome into s and String s will print welcome
	public void m1(String s)
	{
		System.out.println(s);
	}
	@Test(priority =2)
	@Parameters({"a","b"})
	public void m2(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	
}
