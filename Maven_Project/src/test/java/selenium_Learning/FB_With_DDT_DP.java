package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_With_DDT_DP {
	
		@Test(dataProvider ="dp", dataProviderClass = DDT_with_DataDriven.class)
		public void FBlogin1(String un, String pwrd)
		{
		   System.out.println("ghghgh");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			 driver.findElement(By.id("email")).sendKeys(un);
			 driver.findElement(By.name("pass")).sendKeys(pwrd);
		     driver.findElement(By.id("loginbutton")).click();
		
		}
	}



