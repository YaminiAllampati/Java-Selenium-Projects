package selenium_Learning;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_FBLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String file = "C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx"; 
		 int row = UtilityFile.rowcount(file, "Sheet4");  
		 int cell =  UtilityFile.cellcount(file, "Sheet4", 1);
		for(int i=1; i<=row; i++)
	   {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		
		String un= UtilityFile.celldata(file, "Sheet4", i, 0);
		String pwrd = UtilityFile.celldata(file, "Sheet4", i, 1);
		 driver.findElement(By.id("email")).sendKeys(un);
		 driver.findElement(By.name("pass")).sendKeys(pwrd);
	     driver.findElement(By.id("loginbutton")).click();
	}
	}
}
