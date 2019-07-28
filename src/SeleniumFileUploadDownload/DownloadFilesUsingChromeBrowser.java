package SeleniumFileUploadDownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesUsingChromeBrowser 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users/Tanvir Singh/eclipse-workspace/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.manage().window().maximize();
		
		//Downloading text file
		driver.findElement(By.id("textbox")).sendKeys("testing....");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click(); //download link
		
		Thread.sleep(5000);
		
		// Change it my download file location 
		
		if(isFileExist("C://Users//admin/Downloads/info.txt")==true)
		{
			System.out.println("File Exists...");
		}
		else
		{
			System.out.println("File NOT Exists...");
		}
		
		//Downloading pdf file
		
		driver.findElement(By.id("pdfbox")).sendKeys("testing....");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click(); //Download link for pdf file
		
		Thread.sleep(5000);
		
		// Change it my download file location 
		
		if(isFileExist("C://Users//admin/Downloads/info.pdf")==true)
		{
			System.out.println("File Exists...");
		}
		else
		{
			System.out.println("File NOT Exists...");
		}

	}
	
	
	public static boolean isFileExist(String path)
	{
		File f=new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}

