package package1.Maven_Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonHome_Page {
	
	//WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement accandList;
	@FindBy(xpath=("(//span[.=\"Sign in\"])[1]"))
    WebElement signbtn;
	
	@FindBy(id="nav-logo-sprites")
	WebElement homepge_title;
	
	//searching
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	//signout
	@FindBy(xpath="//span[.=\"Sign Out\"]")
	WebElement signout;
	
	//autosuggestions
		@FindBy(id="searchDropdownBox")
		WebElement drp;
		
		@FindBy(xpath="//div[@class=\"two-pane-results-container\"]/div/div")
		List<WebElement> d;
	
		public void drp()
		{
			Select s = new Select(drp);
			s.selectByVisibleText("Baby");
		}
		public void serach_P1()
		   {
			   search.sendKeys("baby");
		   }
		
		public void as()
		{
			for(int i=0; i<d.size();i++)
			{
				String s1 = d.get(i).getText();
				System.out.println(s1);
				
			}
			d.get(3).click();
		}
	
	
		
		//main program
	public void acAndList(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(accandList).perform();		
	}
	
	public void sbtn()
	{
		signbtn.click();
	}
	
   public void serach_P()
   {
	   search.sendKeys("moblies" + Keys.ENTER);
   }
	
	public void sign_out()
	{
		signout.click();
	}
	
	
	
	public AmazonHome_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	


}
