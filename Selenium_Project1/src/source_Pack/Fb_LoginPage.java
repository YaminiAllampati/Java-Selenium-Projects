package source_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage {
	
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginbtn;
	
	
	public void un()
	{
		username.sendKeys("Yamini@gmail.com");
	}
	public void pswd()
	{
		password.sendKeys("Test@132");
	}
	public void btn()
	{
		loginbtn.click();
	}
	
	
	public Fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	


}
