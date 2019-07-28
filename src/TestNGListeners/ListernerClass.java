package TestNGListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListernerClass extends TestListenerAdapter
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test method started............");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test success.................");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test is failed..............");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test is skipped.............");
	}

}
 