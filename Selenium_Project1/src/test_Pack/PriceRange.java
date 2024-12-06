package test_Pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PriceRange {

	public static void main(String[] args) throws AWTException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=lint+remover+for+clothes&crid=5FEK87ITQTO9&sprefix=%2Caps%2C237&ref=nb_sb_ss_sx-trend-t2-all-v2-purchases_6_0");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("p_36/range-slider_slider-item"));
		Actions a = new Actions(driver);
		a.click(e1).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);  
		
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e = driver.findElement(By.xpath("//a[.=\"Gmail\"]"));
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	Thread.sleep(500);
		Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);

		r.keyPress(KeyEvent.VK_ENTER); */
		
		
	}

}
