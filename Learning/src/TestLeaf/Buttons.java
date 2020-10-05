package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Buttons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//WebElement home = driver.findElement(By.id("home"));
		//home.click();
		
		WebElement position = driver.findElement(By.id("position"));
		Point xy= position.getLocation();
		int x= xy.getX();
		int y =xy.getY();
		System.out.println("X Position: "+ x + "Y position: "+ y);

		WebElement color = driver.findElement(By.id("color"));
		String ButtonColor= color.getCssValue("background-color");
		System.out.println("Button color: "+ ButtonColor);
		
		
	/* Tried to convert rgb code to name = failure :(		
		String Colour= Color.fromString(ButtonColor).asHex();
		System.out.println(Colour); 
	*/
		
		WebElement size = driver.findElement(By.id("size"));
		int height= size.getSize().getHeight();
		System.out.println("Height: "+ height);
		int width = size.getSize().getWidth();
		System.out.println("Width: "+ width);
		
		
		
		driver.quit();
		
		
	}

}
