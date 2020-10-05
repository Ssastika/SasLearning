package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders 

{

	String [][] Inputs= 
		{
				{"Admin","admin123"},
				{"Admin","Admin123"},
				{"admin","admin123"},
				{"Admin1","Admin1"}
		};

	@DataProvider (name = "LoginData")
	public String[][] LoginDataProvider()
	{
		return Inputs;
	}

	@Test (dataProvider = "LoginData")

	public void ProvideData(String UName, String PName)  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/");

		WebElement Username= driver.findElement(By.id("txtUsername"));
		Username.sendKeys(UName);

		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys(PName);

		WebElement Button = driver.findElement(By.id("btnLogin"));
		Button.click();

		driver.quit();

	}
}
