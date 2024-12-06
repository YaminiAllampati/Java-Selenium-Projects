package testNG_Practice_P;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Indices {

	@DataProvider(name = "dp1", indices= {0,2,3})//indices--> when we want to pass the only needed set data and each number indicate the row 
	public Object[][] Dp()
	{
		//Object a[][] = new Object[][] {}; or
		Object a[][] = { 
				{"yamin@gamil.com","Test@132"}, 
				{"xyz@gmail.com","@Test"},
				{"pavan0l123@gmail.com", "test@123"},
				{"abc@gmail.com", "@3434Test"}	};
		return a;
	}
	
	WebDriver driver;	
	@BeforeMethod
	public void login()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Test(dataProvider="dp1")
	public void testLogin(String u, String p)
	{
		
		WebElement username = driver.findElement(By.id("input-email"));
		username.sendKeys(u);
		WebElement pswrd = driver.findElement(By.id("input-password"));
		pswrd.sendKeys(p);
		//get the logo of the login page
		 String logo = driver.findElement(By.xpath("//a[.=\"Qafox.com\"]")).getText();
		 System.out.println(logo);
		//if logo is expected then click on login button
		 Assert.assertEquals("Qafox.com", logo);
		
      //login
		WebElement logbtn = driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]"));
		logbtn.click();
		
		
	}
	
	@AfterMethod
	public void logout()	
	{
		driver.quit();
	} 


}
