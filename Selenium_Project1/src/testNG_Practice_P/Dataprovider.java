package testNG_Practice_P;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@DataProvider(name="Sample")
	public Object[][] test1()
	{
		
		Object i[][] = new Object[][] {{"yamini", 123},{"Pandu", 231}};
		return i;
		
	}
	
	@Test(dataProvider="Sample")
	public void test(String a, int b )
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys(a);
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys(b);
	}

}
