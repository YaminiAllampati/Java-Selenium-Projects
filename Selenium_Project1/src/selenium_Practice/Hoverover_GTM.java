package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_GTM {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		List<WebElement> l =driver.findElements(By.xpath("//div[@class=\"_1Us3XD\"]/ul/a"));
		for(WebElement b : l)
		{
			String s = b.getText();
		System.out.println(s);	
		}
	}
	

}
