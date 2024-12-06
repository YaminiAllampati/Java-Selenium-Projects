package selenium_Learning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityFile1 {
	
	public FileInputStream f;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;
	public String data;
	public String fpath;

	public UtilityFile1(String path) 
	{
          this.fpath=path;  
		
	}
	
	public int rowCount(String fpath, String sheet) throws IOException
	{
		f = new FileInputStream(fpath);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		int rcount = s.getLastRowNum();
		
		return rcount;
		
		
	}
	public int cellCount(String fpath, String sheet, int rcount) throws IOException
	{
		f = new FileInputStream(fpath);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		r = s.getRow(rcount);
	     int ccount = r.getLastCellNum();
		
		return ccount;
		
		
	}
	public String cellData(String fpath, String sheet, int rcount, int ccount) throws IOException
	{
		f = new FileInputStream(fpath);
		 String cdata= WorkbookFactory.create(f).getSheet(sheet).getRow(rcount).getCell(ccount).toString();
		 
		 
		return cdata;
		
		
		
	}


}
