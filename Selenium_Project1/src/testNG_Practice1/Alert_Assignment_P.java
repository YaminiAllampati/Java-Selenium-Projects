package testNG_Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Assignment_P {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
	    WebElement e = driver.findElement(By.xpath("(//input)[5]"));
		e.click();
		Alert a1 = driver.switchTo().alert();
	    System.out.println("Alert popup message : "+ a1.getText());
		a1.accept();
		//driver.switchTo().alert().accept();
		
	}

}
