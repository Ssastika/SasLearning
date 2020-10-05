package TestLeaf;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkText_TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. Partial link text check
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		// 1. Text box validation
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("Hi");
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys(" Appended");
		
		WebElement gettingText = driver.findElement(By.name("username"));
		String value = gettingText.getAttribute("value");
		System.out.println("value: " + value);
		
		WebElement clear = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clear.clear();
		
		WebElement disabled = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		Boolean disable=   disabled.isEnabled();
		System.out.println("Is enabled or not: "+disable);
		
		
		
	}

}
