package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass {
	
	@Test
	@Parameters("Name")
	
	public void printingName(String name)
	{
		System.out.println("Name: "+ name);
	}

}
