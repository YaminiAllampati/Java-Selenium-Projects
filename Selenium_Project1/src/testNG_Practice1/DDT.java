package testNG_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {

	public static void main(String[] args) {
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.amazon.in/a/addresses/add?ref=ya_address_book_add_post");
   WebElement d = driver.findElement(By.xpath("(//span[@class=\"a-button-text a-declarative\"])[3]"));
	d.click();
	}

}
