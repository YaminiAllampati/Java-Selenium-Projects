package testNg_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClassConcepts {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@Test
	public void scroll()
	{
		WebElement e = driver.findElement(By.xpath(" //span[@class=\"navFooterBackToTopText\"] "));
		Point p = e.getLocation();
		int x = p.getX();
		int y=p.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
	}
	
	@Test(enabled=false)
	public void drp()
	{
		WebElement e = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(e);
		s.selectByVisibleText("Furniture");
		WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("sofa");
	    List<WebElement> l =driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
	    
	    for(int i=0; i<l.size(); i++)
	    {
	    	String drpv = l.get(i).getText();
	    	
	    	System.out.println(drpv);
	    	
	    }
	    l.get(4).click();
	    
	   List<WebElement> links =  driver.findElements(By.tagName("a"));
	   System.out.println("size : " + links.size());
	  /* for(WebElement l1 :links)
	   {
		   System.out.println(l1.getText());
	   } */
	   
	}
	
	@Test(enabled=false)
	public void hover() throws IOException
	{
		
	WebElement e = driver.findElement(By.xpath("//span[.=\"Fresh\"]"));
	Actions a = new Actions(driver);
	a.moveToElement(e).perform();
	
	driver.findElement(By.xpath("(//img[@class=\"f3-cgi-flyout-store-img\"])[1]")).click();
	

	Date d1 = new Date();
    System.out.println(d1.getTime());
    
    Date d2 = new Date(d1.getTime());
    System.out.println(d2);
    
    String s = d2.toString();
    System.out.println(s);
    
    String time = s.substring(11, 19).replace(":", "-");
    System.out.println(time);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File sr = ts.getScreenshotAs(OutputType.FILE);
	//File des = new File("C:\\Users\\yamin\\OneDrive\\Desktop\\Selenium_SS\\pandu1_" + Math.random() + new ActionClassConcepts().getClass() +".png");
	File des = new File("C:\\Users\\yamin\\OneDrive\\Desktop\\Selenium_SS\\pandu_" + time +".png");

	FileHandler.copy(sr, des);
	}
	@AfterMethod
	public void logout()
	{
		//driver.quit();
	}

}
