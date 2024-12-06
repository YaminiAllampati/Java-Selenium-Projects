package package1.Maven_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	//login into the amazon ---> homepage-->sign-->homepage
	@Test
	public void TC1() throws EncryptedDocumentException, IOException
	{
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		AmazonHome_Page p = new AmazonHome_Page(driver);//constructor paramtertized
		p.acAndList(driver);
		p.sbtn();
		Amazon_SignPage s = new Amazon_SignPage(driver);
		s.un();
		s.cntnu_Btn();
		s.pswrd();
		s.sgn_btn();
		Assert.assertEquals(p.homepge_title.getText(), ".in");
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		
		             
		
	}
	
	

}
