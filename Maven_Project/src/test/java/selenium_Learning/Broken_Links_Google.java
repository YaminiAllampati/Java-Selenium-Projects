package selenium_Learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Broken_Links_Google {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofSeconds(10000))args;
		wait.until(ExpectedConditions.)
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links : " + links.size());
		
		for(int i=0; i<links.size(); i++)
		{
			   String url =  links.get(i).getAttribute("href");
			  // System.out.println(url);
			   
			   brokenlink(url);
	
		}
		
	}
	
	public static void brokenlink(String url) throws IOException
	{
		
		URL u1 = new URL(url);
		HttpURLConnection u2 =(HttpURLConnection) u1.openConnection();
		
		
		
		if(u2.getResponseCode()==200)
		{
			System.out.println("link is valid " + url + " - " + u2.getResponseMessage());
		}
		else
		{
			System.out.println("link is not valid " + url + " - " + u2.getResponseMessage());
		}
		
	}

}
