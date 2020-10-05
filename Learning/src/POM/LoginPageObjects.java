package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	//Method 1: Finding elements without find element method. Finding with PAge factory method.

	@FindBy(how= How.NAME, using = "username")
	public static WebElement username;

	@FindBy(name ="password")   //This is another method of identifying
	public static WebElement password;

	@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
	public static WebElement LoginButton;


	/*Method 2: The elements to be find in Login page are: UserName, Password, and Login button

	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}

	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}

	public static WebElement LoginButton (WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
	}*/
}
