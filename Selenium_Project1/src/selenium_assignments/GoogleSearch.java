package selenium_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GoogleSearch {

	public static void main(String[] args) {


			ChromeDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();
	          driver.get("https://www.google.com");
	   FluentWait<ChromeDriver> f1=new   FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class) ;
	   f1.until(ExpectedConditions.titleIs("Manish"));	       
	 // ArrayList<Integer> a1=new ArrayList<Integer>(); 
	          
	          WebElement search = driver.findElement(By.name("q"));
	          search.sendKeys("India" + Keys.ENTER);
	          
	         
	          
	}

}
