package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Write codes separately to select QTP 10 and Energy 15 using Select by Visible Text.
public class DropDown_MKT {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		//to select QTP10
		WebElement e = driver.findElement(By.xpath("(//select[@name='Choice8'])[1]"));
		Select s = new Select(e);
		s.selectByVisibleText("QTP10");
		//to select Energy15
		WebElement e1 = driver.findElement(By.xpath("(//select[@name='Choice4'])[1]"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Energy15");
	}

}
