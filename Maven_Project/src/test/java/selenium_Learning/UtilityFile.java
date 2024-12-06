package selenium_Learning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityFile {

	public static int rowcount(String file, String s) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(file);
		     Workbook w = WorkbookFactory.create(f);
		    int rc= w.getSheet(s).getLastRowNum();
			//System.out.println("Row Count : " + rc);
			return rc;
	}
	
	public static int cellcount(String file, String s, int r) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(file);
		     Workbook w = WorkbookFactory.create(f);
		    int cc= w.getSheet(s).getRow(r).getLastCellNum();
			//System.out.println("Cell Count : " + cc);
			return cc;
	}
	
	public static String celldata(String file, String s, int r, int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(file);
		     Workbook w = WorkbookFactory.create(f);
		    String data= w.getSheet(s).getRow(r).getCell(c).toString();
			return data;
	}
	
	
	
	
	

}
