package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	//Constructor 
			// - constructor name same as class name - //
	// Constructor will be involved at the time of object creation
	LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		// initialize rdriver in this(here represents the entire class
														  // LoginPage
		PageFactory.initElements(rdriver, this);
		//rdriver is applicable to all the elements
		//in this class to this use initElements
		// as initElements initialize the elements
	}
	
	
	// Approach 1 //
/*	
	@FindBy(how=How.NAME,using="userName")
	WebElement txtusername;
	*/
	
		// Approach 2 //
		// here capture the attribute along with the name 
				// name is the attribute and userName is the value)
// Elements + action methods	
	// Identify three different elements in the login page	
		@FindBy(name="userName")
		WebElement txtuserName;
		// now store store the userName into a variable 
			// that is WebElement txtuserName
		
		@FindBy(name="password")
		WebElement txtpassword;

		@FindBy(name="login") 
		WebElement btnlogin;
// actions methods
		// the parameter uname comes from the actual test case called 
										// LoginTest
		public void setusername(String uname)
		{
			txtuserName.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtpassword.sendKeys(pwd);
		}
		
		public void clickSubmit()
		{
			btnlogin.click();
		}
	}


