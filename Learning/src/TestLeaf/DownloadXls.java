package TestLeaf;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DownloadXls {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/download.html");

		WebElement LinkText = driver.findElement(By.partialLinkText("Download Excel"));
		LinkText.click();
		
		//Thread.sleep(3000);

		File fileLocation = new File("C:\\Users\\sastika.p\\Downloads");
		File[] AllFiles = fileLocation.listFiles();

		for (File file : AllFiles) {
			
			if (file.getName().equals("testleaf.xlsx")) 
			{
				System.out.println("File is downloaded");
				break;	
			}
		}
		
		driver.close();
	}
}