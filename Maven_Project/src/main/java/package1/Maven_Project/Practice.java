package package1.Maven_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice {
	

	WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement accandList;
	@FindBy(xpath=("(//span[.=\"Sign in\"])[1]"))
    WebElement signbtn;
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement c_btn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement sign_btn;
	
	public void acAndList(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(accandList).perform();		
	}
	
	public void sbtn()
	{
		signbtn.click();
	}
	
	public void un(String userna) throws EncryptedDocumentException, IOException
	{	
		username.sendKeys(userna);
	}
	
	public void cntnu_Btn()
	{
		c_btn.click();
	}
	public void pswrd()
	{
		password.sendKeys("9492335791");
	}
	public void sgn_btn()
	{
		sign_btn.click();
	}
	
	public Practice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
