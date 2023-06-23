package rahulshettyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Thread.sleep(2000);
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   //select the Radio button
		   driver.manage().window().maximize();
		   driver.switchTo().frame("iframe-name");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		   Thread.sleep(2000);
		   driver.navigate().back();
		   driver.switchTo().defaultContent();
		   
		   //action class object 
		   
		WebElement  mouseover= driver.findElement(By.xpath("//button[@id='mousehover']"));
		   Thread.sleep(2000);
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(mouseover).perform();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@id='mousehover']//a[@text()='Top']")).click();

		     
}
}
