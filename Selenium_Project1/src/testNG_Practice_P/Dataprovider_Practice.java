package testNG_Practice_P;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Practice {

	@DataProvider(name="Practice")
	public Object[][] test1()
	{
		Object i[][] = new Object[][] {{1,2},{3,4}, {4,6}};
		return i;

}
	@Test(dataProvider="Practice")
	public void test(int a, int b)
	{
		
		int sum;
		sum = a+b;
		System.out.println(sum);
		Reporter.log("Addition is -> "+sum);
		
		
		
	}
/*	
	@Test(dataProvider="Practice")
	public void test(int a, int b)
	{
		
		int sum = 1;
		sum = sum+a;
		System.out.println(sum);
		
		
	}  */
}
