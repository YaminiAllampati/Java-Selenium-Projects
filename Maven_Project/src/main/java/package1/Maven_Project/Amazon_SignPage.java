package package1.Maven_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SignPage {
	
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement c_btn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement sign_btn;
	
	

	public void un()
	{		
		username.sendKeys("8688380891");
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
	
	public Amazon_SignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
