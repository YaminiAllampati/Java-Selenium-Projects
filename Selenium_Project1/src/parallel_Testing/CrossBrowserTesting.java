package parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void login(String bwsr)
	{
		switch(bwsr)
		{
		case "chrome":  driver = new ChromeDriver();
                        break;
        case "edge":    driver = new EdgeDriver();
                        break;
        case "firefox": driver = new FirefoxDriver();
                        break;
       default : System.out.println("incorrect browser name");
                        return;
 	
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
	}
		@Test
		public void Test1()
		{
			String s = driver.getTitle();
			System.out.println(s);
			Assert.assertEquals(s, "OrangeHRM");
		}
		
		@Test
		public void Test2()
		{
			
			Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		
		@AfterMethod
		public void logout()
		{
			driver.quit();
		}

	

		
	}
	

	


