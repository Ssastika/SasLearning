package TestLeaf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		// Count of Columns
		
		List <WebElement> Columns = driver.findElements(By.tagName("th"));
		int ColumnCount = Columns.size();
		System.out.println("No of columns in the table: "+ ColumnCount);
		
		List <WebElement> Rows = driver.findElements(By.tagName("tr"));
		int RowCount = Rows.size();
		System.out.println("No of rows in the table: "+ RowCount);
		
		//Getting the progress value of Learn to interact with elements
		
		WebElement Percentage = driver.findElement(By.xpath("//td[normalize-space() ='Learn to interact with Elements']//following::td[1]"));
		String Progress = Percentage.getText();
		System.out.println("Progress of Learn to Interact with Elements is :" + Progress);
		
		
		//Check the vital task for the least completed progress
		
		List <WebElement> AllProgress = driver.findElements(By.xpath("//td[2]"));
		
		// Storing the values in Integer list
		// In this list only integers can be stored.
		// Here we are assigning an object to the list
		
		List <Integer> progressList = new ArrayList <Integer>();
		
		for (WebElement webElement : AllProgress) 
		{
			//replacing the '%' character to null as in string it will throw error
			String Individuals = webElement.getText().replace("%", "");
			// Converting String to Integer
			progressList.add(Integer.parseInt(Individuals));		
		}
		
		System.out.println("All the values from the Progress column: " +progressList);
		
		//Finding the minimum value from the list
		int SmallestProgressValue = Collections.min(progressList);
		System.out.println("Smallest progress value in the table is: "+ SmallestProgressValue);
		
		driver.close();
		
		

	}

}
