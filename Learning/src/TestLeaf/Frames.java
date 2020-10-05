package TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement click = driver.findElement(By.id("click"));
		click.click();
		String clickText= driver.findElement(By.id("Click")).getText();
		System.out.println("Click button content inside frame: " +clickText);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement nestedframe = driver.findElement(By.xpath("//*[@id=\'Click1\']"));
		nestedframe.click();
		String NestedFreame= driver.findElement(By.id("Click1")).getText();
		System.out.println("Click button content in Nested frame: " + NestedFreame);
		
		driver.switchTo().defaultContent();
		List<WebElement> FrameCount= driver.findElements(By.tagName("iframe"));
		int Frames = FrameCount.size();
		System.out.println("Total No of Frames:" + Frames);
		
		driver.close();	
		
	}

}
