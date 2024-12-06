package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
       
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/excel-to-pdf");
		driver.manage().window().maximize();
		
	WebElement e = driver.findElement(By.xpath("//button[@class=\"l3tlg0-0 ggoliT\"]"));
	e.sendKeys("Downloads\\Automation batch 45.xlsx");
	}
	

}
