package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumOfLinks_Images {

	public static void main(String[] args) {
 
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("links : " + links.size());
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Images : " + img.size());
		 driver.findElement(By.xpath("(//a[@id=\"itemc\"])[1]")).click();
		
	}

}
