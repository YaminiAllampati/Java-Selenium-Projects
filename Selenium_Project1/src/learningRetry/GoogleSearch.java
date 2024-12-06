package learningRetry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	
	@Test(retryAnalyzer=learningRetry.Retry_logic.class)
	public void test()
	{
	
			ChromeDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();
			
	        driver.get("https://www.google.com");
	        WebElement search = driver.findElement(By.name("qtt"));
	        search.sendKeys("india" + Keys.ENTER);
	        driver.quit();
	}

}
