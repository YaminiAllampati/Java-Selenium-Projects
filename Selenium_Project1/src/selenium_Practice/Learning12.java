package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning12 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Yamini");
		WebElement e = driver.findElement(By.id("female"));
		boolean b = e.isDisplayed();
		System.out.println(b);
		boolean b1 = e.isSelected();
		System.out.println(b1);
		if(b1==false)
		{
			e.click();
		}
		System.out.println(e.isSelected());
	}

}
