package Selenium_Practice;

import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Title {

	public static void main(String[] args) {
             
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
	}

}
