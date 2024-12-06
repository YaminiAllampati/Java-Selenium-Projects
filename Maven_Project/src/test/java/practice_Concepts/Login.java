package practice_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@Test
	public void TC1()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		WebElement userid = driver.findElement(By.name("uid"));
		userid.sendKeys("mngr600780");
		WebElement pswrd = driver.findElement(By.name("password"));
		pswrd.sendKeys("jUpEvYg");
		WebElement btn = driver.findElement(By.name("btnLogin"));
		btn.click();
		String logo = driver.findElement(By.xpath("//div[@class=\"logo\"]")).getText();
		System.out.println(logo);
	    Assert.assertEquals(logo, "Demo Site");
		
	}

}
