package package1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BrowserInvocation;
import resources.extentReports;

public class ListernersClass extends BrowserInvocation implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent=extentReports.getReportObject();  // calling extent report method usig classname 
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();  // to make parallel execution thread safe we are using ThreadLocal class 
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		 test =extent.createTest(result.getMethod().getMethodName());  // to get name test name dynamically
		 extentTest.set(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		extentTest.get().log(Status.PASS,"TEST Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		//ITestListener.super.onTestFailure(result);
		//take screenshot on failure
		
		// to get driver
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		String TestcaseName = result.getMethod().getMethodName();     // to get the test name and we need to extend browserINvocation class as screenshot script is present there
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(TestcaseName,driver),TestcaseName );	// to attach screenshot where test is failing in extentreports
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		extent.flush();
	}

}
