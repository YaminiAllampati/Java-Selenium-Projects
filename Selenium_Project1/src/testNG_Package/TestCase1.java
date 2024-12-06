package testNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@AfterTest
	public void AT()
	{
		System.out.println("After Test");
	}

	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before Method");
	}

	

	@AfterMethod
	public void AM()
	{
		System.out.println("After Method");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public void AC()
	{
		System.out.println("After Class");
	}
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void AS()
	{
		System.out.println("After Suite");
	}
	@Test                                                                                                                     
	public static void TC1()
	{
		System.out.println("Test Case11");
	}
	@Test
	public static void TC2()
	{
		System.out.println("Test Case22");
	}
	
	
}
