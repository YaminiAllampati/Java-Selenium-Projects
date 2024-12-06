package selenium_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Navigational Commands/methods
 * 1)navigate.to(url);
 * 2)navigate.back();
 * 3)navigate.forward();
 * 4)navigate.refresh();
 */

public class Navigational_Commands {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");//to launch url
		//click on gmail icon
		WebElement  e = driver.findElement(By.xpath("//a[.=\"Gmail\"]"));
		e.click();
		System.out.println(driver.getCurrentUrl());
		//to go back page
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//to forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		//refresg page
		driver.navigate().refresh();
	}

}
