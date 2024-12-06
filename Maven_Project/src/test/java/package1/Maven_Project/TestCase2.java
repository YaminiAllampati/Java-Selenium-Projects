package package1.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	
	//login --> search the product -->logout
		@Test
		public void TC2()
		{
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			//hompage
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
			h.serach_P();
			//homepage-->signout
			h.acAndList(driver);
			h.sign_out();
			
			Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
			
			
			
		}
		
		
}
