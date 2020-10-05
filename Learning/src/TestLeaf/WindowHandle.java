package TestLeaf;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		String HomePage = driver.getWindowHandle();

		WebElement Home = driver.findElement(By.id("home"));
		Home.click();

		Set<String> Windows =  driver.getWindowHandles();

		for (String newWindow : Windows) {
			driver.switchTo().window(newWindow);
		}

		WebElement Edit  = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		Edit.click();
		driver.close();

		driver.switchTo().window(HomePage);

		WebElement OpenMultipleWindows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		OpenMultipleWindows.click();

		int NoOfWindows= driver.getWindowHandles().size();
		System.out.println(NoOfWindows);


		WebElement DontClose = driver.findElement(By.id("color"));
		DontClose.click();

		Set<String> CloseWindows=  driver.getWindowHandles();

		for (String ClosingWindows : CloseWindows) {
			if(!ClosingWindows.equals(HomePage))
			{
				driver.switchTo().window(ClosingWindows);
				driver.close();
			}
		}

		driver.quit();	
	}


}
