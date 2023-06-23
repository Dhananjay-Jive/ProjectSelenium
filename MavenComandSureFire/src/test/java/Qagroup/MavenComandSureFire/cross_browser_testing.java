package Qagroup.MavenComandSureFire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cross_browser_testing {
	 @Parameters("browserName")
	@Test
  public void crossBrowsing(String browserName)
  {
	  WebDriver driver=null;
	   if(browserName.equals("edge"))
	   {
		   WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
	   }
	   else if(browserName.equals("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   
	   }
	  
	  
  }
}
