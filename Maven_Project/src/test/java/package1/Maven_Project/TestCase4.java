package package1.Maven_Project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 {
	
	@Test
	public void TC4() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
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
		//add to wishlist
		w.wishlist_P(); 
		//view wishlist product
		w.View_WishList_P();
		//add to cart the product
		w.addToCart_P();
		//proceed to checkout
		w.p_CheckOut();
		//adress
		
		AddToCart_Payment p = new AddToCart_Payment(driver);
		p.adddress_P();
		p.cardSelection();
		//click on enter details
		p.click_CardDetails();
		//switch to frame
		p.iframe(driver);
		
		//enter card number
		p.card_Number();
		
		//enter the expiry month & year
		p.expiry_Month();
		p.expiry_Year();
		
		p.ccard_btn();
		
		
		//p.returnToMainPage(driver);
		//Thread.sleep(1000);
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("(//a[@class=\"a-link-normal\"])[9]")).click();
		//System.out.println("title : "+ driver.getTitle());
		//webdriverwait e = new webDriverWait(driver, Duration.ofSeconds(1000));
		WebElement cvv_frame = driver.findElement(By.name("apx-secure-field-addCreditCardVerificationNumber"));
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(cvv_frame));
		
		driver.switchTo().frame(cvv_frame);
		WebDriverWait w2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		w2.until(ExpectedConditions.elementToBeClickable(p.cVV));
		
		p.cvv_num();
		//Thread.sleep(1000);
	    driver.switchTo().defaultContent();
		 p.payment_method();
		
		
		
		/*/homepage-->signout
		driver.switchTo().window(parentId);
		h.acAndList(driver);
		h.sign_out();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In"); */
		
		
	}

	



}
