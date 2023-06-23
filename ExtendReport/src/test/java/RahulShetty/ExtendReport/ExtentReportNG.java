package RahulShetty.ExtendReport;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	 
	 static ExtentReports extent; 
	
	public static ExtentReports config()
	  {   String path= System.getProperty("user.dir")+"\\report\\index.html";
	       extent=new ExtentReports();
		   ExtentSparkReporter Reporter=new ExtentSparkReporter(path) ;
		   //to set the report name
		   Reporter.config().setReportName("web automation result");
		   Reporter.config().setDocumentTitle("test Result");
		   
		   //attach the report the exentreport main class

		   extent.attachReporter(Reporter);
		   return extent;
		  
}
	  
}
