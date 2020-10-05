package TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
        List <WebElement> Select = driver.findElements(By.xpath("//*[@id=\'selectable']/li"));
        // //*[@id="selectable"]
        int ListSize = Select.size();
        System.out.println("List of elements in the list: "+ListSize);
        
        Actions action = new Actions(driver);
           
        action.clickAndHold(Select.get(0));
        action.clickAndHold(Select.get(1));
        action.clickAndHold(Select.get(2));
        action.build().perform(); 
 
/*  This method also works fine :)
 
        action.keyDown(Keys.CONTROL)
        .click(Select.get(0))
        .click(Select.get(1))
        .click(Select.get(2)).build().perform();
    
*/              
        driver.close();
        
        
	}

}
