package iTestListeners_Concept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import pageObjects.ITestListeners;

public class ITestListners_P implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	    System.out.println("Test case started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	    System.out.println("Testcase success");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
	    System.out.println("Testcase Failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	    System.out.println("Testcase Skipped");

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onStart(context);
	    System.out.println("Test execution started");

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	    System.out.println("Test execution ended");
	}
	
	
	

}
