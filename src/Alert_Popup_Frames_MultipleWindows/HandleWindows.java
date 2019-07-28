  package Alert_Popup_Frames_MultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		// Switching from one tab or page (browser)
		
	
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		//String h=driver.getWindowHandle();
		//System.out.println(h); //CDwindow-72CC4AFB8ACF383DB4917DB4FB6424E1 // ID of the window open
		
		// Every browser window has a unique ID it is called handle
		//getWindowHandle = gives IDs/ value for one window that is open
		//GetWindowHandles = gives IDs/ value for the multiple windows that are open
		
		Set<String> handlevalues=driver.getWindowHandles();
		
		for(String h:handlevalues)         
		{
			//System.out.println(h);   // Switching from one window to another  
			String title=driver.switchTo().window(h).getTitle();// switch to browser window
			//System.out.println(title);
			
			if(title.equals("Sakinalium | Home"))// here we put the title of the page we need to switch to
			{
				// Opening an element inside the page opened "Sakinalium | Home"
				driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click();
			}
			
		}
		
		//driver.close();
		driver.quit();

	}

}
