package test_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source_Pack.Fb_LoginPage;

public class FB_Logic {
	
	WebDriver driver;
	
	@Test
	public void fbLogin()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Fb_LoginPage f = new Fb_LoginPage(driver);
		f.un();
		f.pswd();
		f.btn();
		
	}

}
