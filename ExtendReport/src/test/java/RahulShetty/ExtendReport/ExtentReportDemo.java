package RahulShetty.ExtendReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo  extends ExtentReportNG{
   public static  WebDriver driver;
   

  
  
	@Test
	public void Initialdemo() throws InterruptedException
	{      
		 WebDriverManager.chromedriver().setup(); 
		   driver=new ChromeDriver();
		   
		   driver.get("https://rahulshettyacademy.com/");
			Thread.sleep(2000);
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   Thread.sleep(2000);
			     driver.manage().window().maximize();
			     System.out.println(driver.getTitle());
		   
	}
	
	
}
