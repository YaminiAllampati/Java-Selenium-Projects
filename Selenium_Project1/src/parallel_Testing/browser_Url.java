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

public class browser_Url {
	
WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser", "url"})
	public void login(String bwsr, String u)
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
		driver.get(u);	
		driver.manage().window().maximize();
	}
		@Test
		public void Test1()
		{
			String s = driver.getTitle();
			System.out.println(s);
			Assert.assertEquals(s, "OrangeHRM");
		}
		
		
		@AfterMethod
		public void logout()
		{
			driver.quit();
		}

	


}
