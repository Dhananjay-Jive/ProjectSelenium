package Qagroup.MavenComandSureFire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderAnotation {
   @DataProvider()
   public static Object[][] getdataFromdataProvider() throws IOException
   {
	   Object data[][]= utility.getDataFromExcel("Sheet1");
	   return data;
   }
	
	@Test(dataProvider="getdataFromdataProvider")
    public void getData(String Username,String Password)
    {
    	 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		   System.out.println(Username +" "+ Password);
		   
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		   
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   
		   
		   
    }
}
