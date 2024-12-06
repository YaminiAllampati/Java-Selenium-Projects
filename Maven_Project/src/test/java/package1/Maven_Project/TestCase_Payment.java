package package1.Maven_Project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_Payment {
	
	@Test
	public void TC3() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		AmazonHome_Page h = new AmazonHome_Page(driver);
		h.acAndList(driver);
		h.sbtn();
		//login page
		Amazon_SignPage s = new Amazon_SignPage(driver);
		s.un();
		s.cntnu_Btn();
		s.pswrd();
		s.sgn_btn();
		Assert.assertEquals(h.homepge_title.getText(), ".in");
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		//Search the product
		//h.serach_P();
		//Thread.sleep(2000);
		//wishlist-->ProductSearchpage
		Amazon_ProductSearchPage w = new Amazon_ProductSearchPage(driver);
		w.serach_P();
		w.Product_Pick();
		//Thread.sleep(1000);
		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh);
		Iterator<String> i = wh.iterator();
		String parentId  = i.next();
		String ChildId = i.next();
		
		driver.switchTo().window(ChildId);
		w.wishlist_P(); 
		
		Thread.sleep(1000);
		w.W_CloseBtn();
		
		//addproduct
		//AddToCart_Payment p = new AddToCart_Payment(driver);
		//p.addToCart_P();
	
		
		
		
		
		
		
		
		
		
		
		
	/*	//homepage-->signout
		driver.switchTo().window(parentId);
		h.acAndList(driver);
		h.sign_out();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In"); */
		
		
		
	}

	



}
