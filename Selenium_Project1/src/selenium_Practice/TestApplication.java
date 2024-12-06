package selenium_Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestApplication {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//getTitle()
		String title = driver.getTitle();
		System.out.println(title);
		//getCurrentURL
		System.out.println("Current url :" + driver.getCurrentUrl());
		//windowHandle()
		String w = driver.getWindowHandle();
		System.out.println(w);
		//windowHandles()
		//driver.findElement(By.xpath("//button[.='New Tab']")).click();
		//Set<String> w1 = driver.getWindowHandles();
		//System.out.println(w1);
		//inputbox - is Enabled/displayed
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		boolean b1 = e.isDisplayed();
		System.out.println(b1);
		boolean b2 = e.isEnabled();
		System.out.println(b2);
		if(b1&&b2)
		{
			System.out.println("user name is enabled & displayed");
		e.sendKeys("Yamini A");
		}
		else
		{
			System.out.println("its not displayed");
		}
		//radio button - checked or not
		//before checked
		WebElement rf = driver.findElement(By.xpath("//input[@id='female']"));
		System.out.println("before checked : " + rf.isSelected());
		//after checked
		rf.click();
	   System.out.println("after checked : " + rf.isSelected());
	   //all check boxes checked
	   List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"form-group\"]/div"));
	   for(WebElement e1 : l)
	   {
		   String s = e1.getText();
            if(s.equals("Sunday") || s.equals("Saturday"))
            {
            	System.out.println("checked boxes :" + s);
            	e1.click();
            }
	   }
	   //dropdownvalue - using select class
	   
	   WebElement d = driver.findElement(By.xpath("//select[@id='country']"));
	   Select s = new Select(d);
	   s.selectByVisibleText("India");
	   
	   //dragand Drop using action class
	   
	   WebElement d1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	   WebElement d2 = driver.findElement(By.xpath("//div[@id='droppable']")); 
	   Actions a = new Actions(driver);
	   a.dragAndDrop(d1, d2).perform();
	   //doubleclick
	   WebElement c = driver.findElement(By.xpath("//button[.='Copy Text']"));
	   a.doubleClick(c).perform();
	   //total links
	   List<WebElement> t = driver.findElements(By.tagName("a"));
	   System.out.println("Total no.of Links : " + t.size());
	   for(WebElement e1 : t)
	   {
		   String S = e1.getText();
		   System.out.println("LinkedText : " + S);
	   }
	   //scrolling
	   Thread.sleep(2000);
	   WebElement sc = driver.findElement(By.xpath("//h2[.=\"XPath Axes\"]"));
	   Point p = sc.getLocation();
	   int x = p.getX();
	   int y = p.getY();
	   System.out.println(x);
	   System.out.println(y);
	   JavascriptExecutor js = driver;
	   js.executeScript("window.scrollBy(0,"+y+")"); 
	   
	   
	   
	   
	   
		
		
		
		
		
		
	}

}
