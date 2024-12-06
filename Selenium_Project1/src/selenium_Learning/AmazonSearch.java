package selenium_Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_8ipd9izczt_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154953&hvtargid=kwd-83014163717471:loc-90&hydadcr=5621_2377279&msclkid=ed0d22a8dc42159375d7445a24cd67d");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//enter something in amazon search option
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys("shirts");
		//click on search button
		//WebElement b = driver.findElement(By.id("nav-search-submit-button"));
		//b.click();
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
         System.out.println("size : "+ li.size());	
         
         for(int i=0; i<li.size(); i++)
         {
     	     //li = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
        	 WebElement link =li.get(i);//click();
        	 link.click();
        	 Thread.sleep(1000);
        	 driver.navigate().back();
        	s= driver.findElement(By.id("twotabsearchtextbox"));
     		s.sendKeys("shirts");
         }
         //li.get(2).click();
	}

}
