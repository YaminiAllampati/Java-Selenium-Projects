package take_Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreen_WrongLocation {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.=\"Mobiles & Tablets\"]")).click();
		//TakesScreenshot is an interface
		TakesScreenshot ts = driver;
		//getScreenshotAs() - its abstract method of TakesScreenshot Interface
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\yamin\\OneDrive\\Desktop\\Test\\Yamini.png");
		//fileHandler class is used to copy the file from soruce to destination
		FileHandler.copy(Source, destination);
	}

}
