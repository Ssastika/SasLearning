package TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));

		Select select  = new Select(dropdown1);
		select.selectByIndex(2);		
		select.selectByValue("4");
		select.selectByVisibleText("Selenium");

		List<WebElement> list = select.getOptions();
		int listsize= list.size();
		System.out.println(listsize);
		
//sending keys to the drop down list
		dropdown1.sendKeys("L");
		
//selecting multiple options in the drop down
		WebElement multi = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiple = new Select(multi);

		multiple.selectByValue("1");
		multiple.selectByValue("2");
		multiple.selectByValue("3");

/* this too works fine
		multiple.selectByIndex(1);
		multiple.selectByIndex(2);
		multiple.selectByIndex(3);
*/
	}
}
