package SeleniumFileUploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload_OrangeHRM {
public static void main(String[] args) throws FindFailed, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php");
		
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//PIM-->Add Employee
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click(); //PIM Tab
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click(); //Add Employee
		driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click(); //Choose file
		
		
		//Sikuli code starts here..
		
		String path = ("C:\\Users\\Tanvir Singh\\Desktop\\Drivers\\Sikuli_screenshot\\");
				
				Pattern fileInputTextBox=new Pattern(path+"filetxtbox.png");
				Pattern openButton=new Pattern(path+"openbtn.png");
				
				Screen s=new Screen();
				
				s.wait(fileInputTextBox,20);
				s.type(fileInputTextBox, path+"profilepic.jpg");
				s.click(openButton);
		
	}

}

