package testNG_Practice_P;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_P1 {
	
	
	@DataProvider(name = "dp1")
	public Object[][] Dp1()
	{
		Object a[][] = { 
				{"yamin@gamil.com","Test@132"}, 
				{"xyz@gmail.com","@Test"},
		};
		return a;
	}
	@DataProvider(name="dp2")
	public Object[][] Dp2()
	{
		Object[][] b = new Object[][] {{"ayamini19999@gmail.com","TestUser@1428"}};
		
		return b;
		
	}
	
	WebDriver driver;	
	@BeforeMethod
	public void login()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	//TC-1
	@Test(dataProvider="dp1")
	public void testLogin(String u, String p)
	{
		
		WebElement username = driver.findElement(By.id("input-email"));
		username.sendKeys(u);
		WebElement pswrd = driver.findElement(By.id("input-password"));
		pswrd.sendKeys(p);
	
      //login
		WebElement logbtn = driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]"));
		logbtn.click();
		
		/*get the logo of the login page
		 String logo = driver.findElement(By.xpath("//a[.=\"Qafox.com\"]")).getText();
		System.out.println(logo);
		//if logo is expected then click on login button
		Assert.assertEquals("Qafox.com", logo, "title mismatched"); */
		
		//Assertion
		Assert.assertEquals(driver.getTitle(), "Your Store");//failed due to mismatch
		System.out.println("logout succesfully");
		
					
		
		
		
	}
	//TC-2
	@Test(dataProvider="dp2")
	public void Test2(String us, String ps) throws InterruptedException
	{
		WebElement username = driver.findElement(By.id("input-email"));
		username.sendKeys(us);
		WebElement pswrd = driver.findElement(By.id("input-password"));
		pswrd.sendKeys(ps);
		
        //login
		WebElement logbtn = driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]"));
		logbtn.click();
		Thread.sleep(1000);
		
		//Assertion
		WebElement e = driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]"));
		boolean s =e.isDisplayed();
		System.out.println(s);
		
		Assert.assertEquals(s, true);
		//account-->logout
		e.click();
		
		
		WebElement logout = driver.findElement(By.xpath("(//a[.=\"Logout\"])[1]"));
		logout.click();
		
		driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();
		//Assertion
		
		Assert.assertEquals(driver.getTitle(), "Your Store");//failed due to mismatch
		System.out.println("logout succesfully");
		
		
		
		
		
	}
	@AfterMethod
	public void logout()	
	{
		driver.quit();
	}  

}
