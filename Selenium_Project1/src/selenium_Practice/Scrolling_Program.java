package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Program {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.name("search_query"));
		e.sendKeys("india");
		WebElement e1 = driver.findElement(By.id("search-icon-legacy"));
		e1.click();	
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("(//span[@id=\"title\"])[7]"));
		Point p = s.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor j = driver;
		j.executeScript("window.scrollBy(0,10000)");
		
	}

}
