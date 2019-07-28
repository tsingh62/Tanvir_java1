package SeleniumFileUploadDownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesUsingFirefoxBrowser 
{
	
public static void main(String[] args) throws InterruptedException {
	
		
		//Additional script we have to create for Firefox browser
		
		FirefoxProfile profile=new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain,application/pdf");		
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled",true );// only for pdf
		
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		// Change this path to your gecko path 
		System.setProperty("webdriver.gecko.driver", "C://Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(options);
		
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
			System.out.println("Text File Exists...");
		}
		else
		{
			System.out.println("Text File NOT Exists...");
		}
		
		//Downloading pdf file
		
		driver.findElement(By.id("pdfbox")).sendKeys("testing....");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click(); //Download link for pdf file
		
		Thread.sleep(5000);
		// Change it my download file location 
		if(isFileExist("C://Users//admin/Downloads/info.pdf")==true)
		{
			System.out.println("pdf File Exists...");
		}
		else
		{
			System.out.println("pdf File NOT Exists...");
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
