package iTestListeners_Concept;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import pageObjects.ITestListeners;

public class ITestListners_ExtentReport implements ITestListener {
	
	 public static WebDriver driver;
	
	public ExtentSparkReporter esr; //UI of the report
	public ExtentReports er;//populate the common info in the report
	public ExtentTest et; //to create a new entry in the sheet & update the TC status as P/F/S.
	
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onStart(context);
	   // System.out.println("Test execution started");
		esr = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/extentreport.html");
		
		esr.config().setDocumentTitle("Automation testing Report"); //title of the report
		esr.config().setReportName("Functional testing"); //name of the report
		esr.config().setTheme(Theme.DARK);
		
		er = new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("CompupterName", "LocalHost");
		er.setSystemInfo("OS","Window");
		er.setSystemInfo("TesterName", "yamini");
		er.setSystemInfo("Env", "QA");
		er.setSystemInfo("broswer", "chrome");


	}

/*	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	   // System.out.println("Test case started");
		
		
	} */

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	    //System.out.println("Testcase success");
		//et = er.createTest(result.getName());//to create a new entry in the sheet
		 et = er.createTest(result.getTestClass().getName());
		   et.assignCategory(result.getMethod().getGroups());
	       et.log(Status.PASS, "Test Case passed : " +  result.getName() ); // to update TC -P/F/S
	       
	       SimpleDateFormat s = new SimpleDateFormat("yyyyMMddhhmmss");
			Date d = new Date();
			String currentDate = s.format(d);
		    String Cdate =  "Google-P-" + currentDate + ".png";
		    System.out.println(Cdate);
			TakesScreenshot ts =  (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
		//	File dstn = new File(".\\Fail SS\\" + Cdate );
			String ssPath="C:\\Users\\yamin\\eclipse-workspace\\Maven_Project\\src\\test\\java\\iTestListeners_Concept\\Pass SS\\GG";

			File dest = new File(ssPath + Cdate);
	         
			
			
			try {
				FileHandler.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			et.addScreenCaptureFromPath(ssPath);
			
			

	}
 
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
	   // System.out.println("Testcase Failed");
		
		 et = er.createTest(result.getTestClass().getName());
		   et.assignCategory(result.getMethod().getGroups());
		et.log(Status.FAIL, "TestCase is Failed : " + result.getName());
		et.log(Status.FAIL, "TestCase  Failed Cause is  : " + result.getThrowable().getMessage());
		
		SimpleDateFormat s = new SimpleDateFormat("yyyyMMddhhmmss");
		Date d = new Date();
		String currentDate = s.format(d);
	    String Cdate =  "Google-F-" + currentDate + ".png";
	    System.out.println(Cdate);
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	//	File dstn = new File(".\\Fail SS\\" + Cdate );
		String ssPath="C:\\Users\\yamin\\eclipse-workspace\\Maven_Project\\src\\test\\java\\iTestListeners_Concept\\Fail SS\\GG";

		File dest = new File(ssPath + Cdate);
         
		
		
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		et.addScreenCaptureFromPath(ssPath);
		
		
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	 //   System.out.println("Testcase Skipped");
	    et = er.createTest(result.getTestClass().getName());
	   et.assignCategory(result.getMethod().getGroups());
	    et.log(Status.SKIP, "Test Case skipped : " +  result.getName() );

	}

	

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	  //  System.out.println("Test execution ended");
	    er.flush(); //write all the tC information in the report at the last
	}
	
	
	

}
