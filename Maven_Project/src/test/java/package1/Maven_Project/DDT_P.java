package package1.Maven_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DDT_P {
	
	@Test
	public void testP() throws EncryptedDocumentException, IOException
	{
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	AmazonHome_Page p = new AmazonHome_Page(driver);//constructor paramtertized
	p.acAndList(driver);
	p.sbtn();
	
	Practice  p1 = new Practice(driver);
	FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Maven_Project\\DDT\\Testdata.xlsx");
    Workbook w = WorkbookFactory.create(f);
    String userna = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     p1.un(userna);
	
	
	}
}
