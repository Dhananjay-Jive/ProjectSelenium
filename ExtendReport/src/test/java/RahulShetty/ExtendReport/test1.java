package RahulShetty.ExtendReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	   
	WebDriver driver;
	  
	  
	@Test
	public void Initialdemo() throws InterruptedException
	{   
		 driver=base. initialise();
		   driver.get("https://rahulshettyacademy.com/");
			Thread.sleep(2000);
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   Thread.sleep(2000);
			     driver.manage().window().maximize();
			     System.out.println(driver.getTitle());
			     driver.close();
		   
	}
}
