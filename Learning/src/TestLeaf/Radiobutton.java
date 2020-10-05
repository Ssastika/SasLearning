package TestLeaf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Radiobutton {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
		WebElement enjoy = driver.findElement(By.id("yes"));
		enjoy.click();
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		WebElement uncheck = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		boolean selected1= check.isSelected();
		boolean selected2 = uncheck.isSelected();
		System.out.println("Defacult selected radio button: "+ selected1);
		System.out.println("Defacult selected radio button: "+ selected2);
			
	}
}
