package RahulShetty.ExtendReport;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listner  extends base implements ITestListener  {
	 public static ExtentTest test;
	 
	   ExtentReports extent=ExtentReportNG.config(); 
	  private static ThreadLocal<ExtentTest> extentest=new ThreadLocal<ExtentTest>();
	  
	  
	 
	@Override
	public void onTestStart(ITestResult result) {
	 
		
		test=extent.createTest(result.getMethod().getMethodName());
		extentest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentest.get().log(Status.PASS, "succesfull");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver=null;
		extentest.get().fail(result.getThrowable());
		Object testObject=result.getInstance();
		  Class clazz=result.getTestClass().getRealClass();
		    try {
				driver= (WebDriver)clazz.getDeclaredField("driver").get(testObject);
			} catch (Exception  e1) {
				// TODO Auto-generated catch block
			
		//take the screenshot
		try {
			extentest.get().addScreenCaptureFromPath(getScreenShotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
			    
			      
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
        extent.flush();
	}

}
