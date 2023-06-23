package RahulShetty.ExtendReport;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2  {
	
	WebDriver driver;

	  
	  
	@Test
	public void Initialdemo() throws InterruptedException
	{         WebDriver driver=base.initialise();
		   
		   driver.get("https://rahulshettyacademy.com/");
			Thread.sleep(2000);
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   Thread.sleep(2000);
			     driver.manage().window().maximize();
			     Assert.assertTrue(false);
			     System.out.println(driver.getTitle());
		    driver.close();
	}
}
