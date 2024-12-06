package selenium_Practice_1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_P {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		e.sendKeys("selenium" + Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"wikipedia-search-results\"]/div/a"));
		
		System.out.println("size : " + l.size());
		
		//driver.findElement(By.xpath("//a[.=\"Selenium\"]")).click();
		
		for(int i=0; i<l.size(); i++)
		{
			WebElement link =  l.get(i);
			System.out.println(link.getText());
			link.click();
			Thread.sleep(1000);

		} 
		
	    Set<String> w = driver.getWindowHandles();
		System.out.println(w);
		
		//approach -1
		//List<String> li = new ArrayList(w);
		//li.get(0);
		//approach-2
		Iterator<String> i = w.iterator();
		String P = i.next();
		String c1 = i.next();
		String c2 = i.next();
		String c3 = i.next();
		String c4 = i.next();
		
		System.out.println(P);
		System.out.println(c1);
		System.out.println(c2); 
		System.out.println(c3);
		System.out.println(c4);
		
		//switch to 3rd child window
		driver.switchTo().window(c3);
		driver.findElement(By.xpath("//li[@id=\"ca-talk\"]/a")).click();
		driver.navigate().back();
		
		
		
	}

}
