package Qagroup.MavenComandSureFire;

import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	  public static void m1() {
			int num=153;
			int org=num;
			   int sum=0;
			   while(num>0)
			   {
				  int rem=num%10;
				  sum= sum+rem*rem*rem;
				   num=num/10;
			   }
			   if(org==sum)
			   {
				   System.out.println("the number is armstrong");
			   }
			   else
			   {
				   System.out.println("not armstrong");
			   }
			 
		}
}
