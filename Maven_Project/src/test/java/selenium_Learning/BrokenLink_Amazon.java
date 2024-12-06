package selenium_Learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* we have got NullPointerException due to the href value is null.
 * To void this exception - we have to go with exception handling
 * by using try & catch block - we can skip this value which is throwing an exception and we can continue with remaining execution 
 */

public class BrokenLink_Amazon {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links : " + links.size());
			for(int i=0; i<links.size(); i++)
			{
				    String url = links.get(i).getAttribute("href");
				    
				    System.out.println(url);
				    
				    brokenlinks(url);	     
			}	
			
				
	}
	
	public static void brokenlinks(String url) throws IOException
	{
		try {
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
		
		catch(MalformedURLException e)
		{
			System.out.println("Exception Handled");
		}
	}

}
