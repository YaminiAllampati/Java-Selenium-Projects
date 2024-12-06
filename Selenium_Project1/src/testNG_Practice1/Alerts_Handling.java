package testNG_Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_Handling {
	//handle single option
   @Test(enabled=false)
	public void alert1() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement e = driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]"));
		e.click();
		Alert a1 = driver.switchTo().alert();
	    System.out.println("Alert popup message : "+ a1.getText());
		a1.accept();
	}
	//handle ok & Cancel option
	@Test(enabled=false)
	public void alert2() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement e = driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]"));
		e.click();
		Alert a1 = driver.switchTo().alert();
	    System.out.println("Alert popup message : "+ a1.getText());
		//a1.accept();
	    a1.dismiss();
	    WebElement e1 = driver.findElement(By.xpath("//p[.=\"You clicked: Cancel\"]"));
	    String s = e1.getText();
	    System.out.println("dismiss message : " + s);
	    if(s.contains("Cancel"))
	    {
	    	 System.out.println("present");
	    }
	}
	//handle alert input box
	@Test
	public void alert3() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement e = driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]"));
		e.click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Yamini");
	    System.out.println("Alert popup message : "+ a1.getText());
		a1.accept();
	    WebElement e1 = driver.findElement(By.xpath("//p[.=\"You entered: Yamini\"]"));
	    String s = e1.getText();
	    System.out.println("inputbox message : " + s);
	    if(s.contains("yamini"))
	    {
	    	 System.out.println("present");
	    }
	    
	    //Authenticated pop-up
	    @Test
	    public void alert4() {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//syntax: http://username:passowrd@the-internet.herokuapp.com/basic_auth
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	    
	}

}
