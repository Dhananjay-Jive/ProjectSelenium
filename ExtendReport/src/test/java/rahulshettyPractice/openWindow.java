package rahulshettyPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openWindow {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Thread.sleep(2000);
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   //select the Radio button
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		   Thread.sleep(2000);
		    Set<String> element=driver.getWindowHandles();
		      ArrayList<String> arr=new ArrayList<String>(element);
		       String mainPageId=arr.get(0);
		       String windopagid=arr.get(1);
		      
		   driver.switchTo().window(windopagid);
		   Thread.sleep(7000);
		   driver.findElement(By.xpath("(//div[@id='navbarSupportedContent']//ul//li)[2]")).click();
		   driver.navigate().back();
		   driver.navigate().back();
		   driver.navigate().back();
		   
		   
}
}
