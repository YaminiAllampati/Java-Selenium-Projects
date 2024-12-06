package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_Form_GTM {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.id("fname"));
        fname.sendKeys("Yamini");
        WebElement lname = driver.findElement(By.id("lname"));
        lname.sendKeys("Allampati");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("yamini1428@gmail.com");
        WebElement pswrd = driver.findElement(By.id("password"));
        pswrd.sendKeys("yamini@1234");
        
        WebElement f_radio_btn = driver.findElement(By.id("Female"));
        f_radio_btn.click();
        //skill dropdown
        WebElement skill = driver.findElement(By.id("Skills"));
        Select s = new Select(skill);
        s.selectByVisibleText("Technical Skills");
        //country dropdown
        WebElement country = driver.findElement(By.id("Country"));
        Select s1 = new Select(country);
        s1.selectByValue("India");
        //course dropdown
        WebElement Tech_Skills = driver.findElement(By.id("technicalskills"));
        Select s2 = new Select(Tech_Skills);
        s2.selectByIndex(7);
        //present address
        WebElement paddress = driver.findElement(By.id("Present-Address"));
        paddress.sendKeys("Chennai");
      //Permanent address
        WebElement per_address = driver.findElement(By.id("Permanent-Address"));
        per_address.sendKeys("Tirupati");
        //Pincode
        WebElement pincode = driver.findElement(By.id("Pincode"));
        pincode.sendKeys("610600");
        //Religion Dropdown
        WebElement relegion= driver.findElement(By.id("Relegion"));
        Select s4 = new Select(relegion);
        s4.selectByVisibleText("Hindu");
        //file upload
        WebElement file_upload = driver.findElement(By.id("file"));
        file_upload.sendKeys("C:\\Users\\yamin\\OneDrive\\Desktop\\Collections.xlsx");
        //checkbox
        WebElement checkbox = driver.findElement(By.id("relocate"));
        checkbox.click();
      //checkbox
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.click();
       
        Thread.sleep(1000);
        //javascript popup
        driver.switchTo().alert().accept();
        
        public String randomString()
        {
        	RandomStringUtils.
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
