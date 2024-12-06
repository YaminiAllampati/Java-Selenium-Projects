package package1.Maven_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductSearchPage {
	
	//searching
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	//pick the product
    //@FindBy(xpath="(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[3]")
	@FindBy(xpath="(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[33]")
	WebElement prdct_Pick;
	
    //wishlist
	@FindBy(id="add-to-wishlist-button-submit") //add-to-wishlist-button-submit
	WebElement wishList;
	
	//close the wishlist window
	@FindBy(xpath="//i[@class=\"a-icon a-icon-close\"]")
	WebElement close_btn;
	
	//view the wishList page
	@FindBy(xpath="//a[.=\"View Your List\"]")
	WebElement View_Wlist_P;
	
	//add to cart
	@FindBy(xpath="(//a[@class=\"a-button-text a-text-center\"])[1]")
	WebElement acart;
	
	
	//proceed to checkout
	@FindBy(xpath="//span[.=\"Proceed to checkout\"]")
	WebElement checkout;
	

	
	
	
	public void serach_P()
	   {
		   search.sendKeys("pens" + Keys.ENTER);
	   }
	
	public void Product_Pick() throws InterruptedException
	{
		Thread.sleep(1000);
		prdct_Pick.click();
	}
	
	public void wishlist_P()
	{
		wishList.click();
	}
	
	public void W_CloseBtn()
	{
		close_btn.click();
	}
	
	public void View_WishList_P()
	{
		View_Wlist_P.click();
	}
	
	public void addToCart_P()
	{
		acart.click();
	}
	
	public void p_CheckOut()
	{
		checkout.click();
	}
	public Amazon_ProductSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
