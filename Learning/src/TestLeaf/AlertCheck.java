package TestLeaf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement Alert1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		Alert1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirm =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirm.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement promt = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promt.click();
		
		Alert prompt1 = driver.switchTo().alert();
		prompt1.sendKeys("Testing");	
		prompt1.accept();			
	}

}
