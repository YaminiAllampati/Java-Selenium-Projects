package testNG_Practice_P;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Singleparameter {
	
	@DataProvider(name="Search")
	public Object[][] test1()
	{
		Object i[][] = new Object[][] {{"NTR Jr"},{"Rohit Sharma"},{"Sachin"}};
		return i;
		
	}
	@Test(dataProvider="Search")
	public void test2(String input)
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(input + Keys.ENTER);
	} 
	

}
