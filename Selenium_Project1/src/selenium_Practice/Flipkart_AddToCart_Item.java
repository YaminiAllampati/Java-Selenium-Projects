package selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart_AddToCart_Item {
public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		e.sendKeys("mobile" + Keys.ENTER);
		WebElement m = driver.findElement(By.xpath("(//img[@class=\"DByuf4\"])[3]"));
		m.click();
		//change control to child window
		    Set<String> s =driver.getWindowHandles();	
	        System.out.println(s);
	        //iterator
	        Iterator<String> i = s.iterator();
	       String parent_Id = i.next();
	       String child_Id = i.next();
	       System.out.println(parent_Id);
	       System.out.println(child_Id);
	       
	       driver.switchTo().window(child_Id);
	       WebElement cart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	       cart.click();
	}

}
