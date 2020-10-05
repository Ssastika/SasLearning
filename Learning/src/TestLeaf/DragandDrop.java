package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To =driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(From, To).build().perform();

		/* This action also works fine :)
		action.clickAndHold(From).moveToElement(To).release(To).build().perform();		
		 */		
		driver.quit();
	}

}
