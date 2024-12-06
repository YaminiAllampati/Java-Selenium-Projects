package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_wishlist {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("bags" + Keys.ENTER);
		Thread.sleep(2000);
		/*WebElement w =driver.findElement(By.xpath("(//div[@class=\"sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16\"])[7]"));
		Thread.sleep(2000);
		w.sendKeys(Keys.ENTER); */
		WebElement we2=driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[2]"));
		  we2.click();
		WebElement d = driver.findElement(By.id("twotabsearchtextbox"));
		d.click();
	}

}

