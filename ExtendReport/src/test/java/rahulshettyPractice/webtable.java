package rahulshettyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Thread.sleep(2000);
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   //select the Radio button
		   driver.manage().window().maximize();
		   for(int i=2;i<10;i++)
		   {
			   for(int j=1 ;j<=3;j++)
			   {
				   WebElement  element=driver.findElement
						   (By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")); 
				     System.out.println(element.getText());
			   }
			   System.out.println("---------------------------------------");
			   System.out.println("---------------------------------------");
			   System.out.println("---------------------------------------");
			   System.out.println("---------------------------------------");
			   System.out.println("---------------------------------------");
		   }
 
}
}
