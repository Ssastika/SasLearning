package TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement TextBox= driver.findElement(By.id("tags"));
		TextBox.sendKeys("r");

		Thread.sleep(4000);
		
		List <WebElement> List = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));

		for (WebElement webElement : List) 
		{
			if (webElement.getText().equals("Cucumber"))
			{
				webElement.click();
				break;
			}
		}
	}

}
