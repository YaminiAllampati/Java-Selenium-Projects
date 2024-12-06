package selenium_Learning;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DDT_with_DataDriven {
	
	@DataProvider(name="dp")
	public Object[][] testData() throws IOException
	{

		String fpath = "C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx"; 
		UtilityFile1 uf = new UtilityFile1(fpath);
		int rc = uf.rowCount(fpath, "Sheet4");
		int cc = uf.cellCount(fpath, "Sheet4", 1);
		Object[][] b = new Object[rc][cc];
		for(int i=1; i<rc;i++)
		{
			for(int j=0; j<cc; j++)
			{
				
				b[i-1][j] = uf.cellData(fpath, "Sheet4", i, j);
				
			}
			
		}
		return b;
		
		
		
	}

}
