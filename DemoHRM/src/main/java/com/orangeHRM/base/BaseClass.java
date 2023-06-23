package com.orangeHRM.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	
 public void InitializeBrowser() throws InterruptedException {
	// System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriverManager.chromedriver().setup(); 
	   driver=new ChromeDriver();
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Thread.sleep(2000);
		     driver.manage().window().maximize();
		 
}


	public void takeScreenshot(String sample1 ) throws IOException {
	    String path=System.getProperty("user.dir")+"/Screenshot/"+sample1+".jpg";
	     
	     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      File Destination =new File(path);
	       
	     FileUtils.copyFile(source, Destination);
	      
	       
	}

	
}
