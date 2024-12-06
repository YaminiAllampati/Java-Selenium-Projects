package package1.Maven_Project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Luanch {
	
	@Test
	public void google()
	{
		ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.google.com");
       // WebElement search = driver.findElement(By.name("q"));
        //search.sendKeys("India" + Keys.ENTER);
        driver.findElement(By.xpath("//a[@class=\"gb_A\"]")).click();
        WebElement f1=driver.findElement(By.name("app"));
        driver.switchTo().frame(f1);
        driver.findElement(By.xpath("(//span[@class=\"Rq5Gcb\"])[4]")).click();
        driver.switchTo().defaultContent();
        System.out.println("title : " + driver.getTitle()); 
        driver.findElement(By.name("search_query")).sendKeys("ntr");
        driver.findElement(By.id("search-icon-legacy")).click();
                                                                                                                                                                                                  
	}

}
