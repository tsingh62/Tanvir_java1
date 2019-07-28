package Selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SiKuli_Demo {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://testautomationpractice.blogspot.com/");
	 		driver.manage().window().maximize();
	 		
	 		driver.switchTo().frame(0);
	 //==== Sikuli used for uploading files ==//
	 		//click on the upload file button
	 		
	 		driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-11\"]")).click();
	 		
	 		// Since the path is same for the links we 
	 		//can pass it into a string 
	 		String path = ("C:\\Users\\Tanvir Singh\\Desktop\\Drivers\\Sikuli_screenshot\\");
	 		// Pattern a predefined class in Sikuli 
	 		// loaction of the screen shots filename and open button + filenames for both 
/*File name Button */	
	 		Pattern fileInputTextBox = new Pattern (path + "filetxtbox.png");
/*Open Button */	 	
	 		Pattern openButton = new Pattern (path + "openbtn.png");
		
	 		// Now we need to pass an object for Screen (pre-defined) in Sikuli
	 		Screen S = new Screen();
	 		S.wait(fileInputTextBox, 20);// SIkuli wait command 
	 		// file that needs to wait for 20 seconds
	 		// == //
	 		// now pass the location of the file that has to be uploaded + file name 
	 		// Here type is pre-defined in Sikuli
	 			// which gives the command go and enter the path
/*Location of file to be uploaded */	
	 		S.type(fileInputTextBox,path + "apple.png");
/*Click open Button */	 				
	 		S.click(openButton);
	}

}
