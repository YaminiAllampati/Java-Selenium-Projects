package package1.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart_Payment {
	
	
	@FindBy(xpath="(//span[@class=\"a-button-inner\"])[3]")
	WebElement address;
	
	//@FindBy(xpath="(//div[@class=\"a-radio\"])[1]")
	@FindBy(xpath="//span[@class=\"pmts-instrument-selector\"]/div//input")
	WebElement cardSeclect;
	
	@FindBy(xpath="//a[.=\"Enter card details\"]")
	WebElement card_Details;
	

	//iframe
	@FindBy(name="ApxSecureIframe")
	WebElement iframe;
	
	//enter credit card details
	@FindBy(name="addCreditCardNumber")
	WebElement card_num;
	
	//enter expiry month
	@FindBy(name="ppw-expirationDate_month")
	WebElement exp_month;
	
	//enter expiry year
	@FindBy(name="ppw-expirationDate_year")
	WebElement exp_year;
	
	//click on enter card details button
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement card_btn;
	
	
	//Enter CVV number
	@FindBy(xpath="//input[@class=\"card-cvv\"]")
	WebElement cVV;
	
	//paymentbutton
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	WebElement payment;
	
	
	
	
	public void adddress_P()
	{
		address.click();
	}
	
	public void cardSelection()
	{
		cardSeclect.click();
	}
	
	public void click_CardDetails()
	{
		card_Details.click();
	}
	
	public void card_Number()
	{
		card_num.sendKeys("4632 0200 0236 7072");
	}
	
	public void iframe(WebDriver driver)
	{
		driver.switchTo().frame(iframe);
	}
	public void expiry_Month()
	{
		Select s = new Select(exp_month);
		s.selectByVisibleText("06");
		
	}
	public void expiry_Year()
	{
		Select s = new Select(exp_year);
		s.selectByVisibleText("2026");
		
	}
	public void ccard_btn()
	{
		card_btn.click();
	}
	public void returnToMainPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void cvv_num()
	{
		cVV.sendKeys("576");
	}
	
	public void payment_method()
	{
		payment.click();
	}
	public AddToCart_Payment(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
