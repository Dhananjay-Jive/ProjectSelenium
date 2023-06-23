package Qagroup.MavenComandSureFire;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertyFiledata {
	
	
      @Test
	   public static  void getData( ) throws IOException
	    {   String URL=getDataFromPropertyFile.propdata("url");
	    	 WebDriverManager.chromedriver().setup();
			    ChromeDriver driver=new ChromeDriver();
			   driver.get(URL); 
}
}
