 package RahulShetty.ExtendReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	 static WebDriver driver;
	public static WebDriver initialise()
	{
		   
			 WebDriverManager.chromedriver().setup(); 
			   driver=new ChromeDriver();
			   return driver;
	}
	public String getScreenShotPath(String testname,WebDriver driver) throws IOException
	  {
		   File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   String path=System.getProperty("user.dir")+"\\report"+testname+ ".jpg";
		    File destination=new File(path);
		    FileUtils.copyFile(source, destination);
		    return path;
	  }
}
