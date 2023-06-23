package com.OrangeHRM.testScript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.utility.BasicUtility;


@Listeners
public class TC_HomePage extends BaseClass {
	  public static  LoginPage login1;
	  public static HomePage home;
	  
  
  @BeforeClass
  public void OpenBrowser() throws InterruptedException
  {
	  InitializeBrowser();
  }
  @BeforeMethod
  public void loginToHRm() throws IOException, InterruptedException
  { 
	  
	  login1=new LoginPage();
   	login1.EnterUserName(BasicUtility.getdataFromPropFile("UN"));
   	Thread.sleep(2000);
   	login1.EnterPasssword(BasicUtility.getdataFromPropFile("PSW"));
   	Thread.sleep(2000);
   	login1.clickLogin();
   	Thread.sleep(2000);
  	
      }
  @DataProvider
  public Object[] []getUserdata() throws FileNotFoundException, InterruptedException
  { Thread.sleep(2000);
  	Object data[][]=BasicUtility.getTestDataFrom_Dataprovider("Sheet1");
  	return data;
  }
  
  @Test(dataProvider="getUserdata")
  public void verifyTestCases(String ActualUser)
  {  
  	home=new HomePage();
     String Expected=home.verifyUserName();             
  	String Actual=ActualUser;
  
  	  Assert.assertEquals(Expected,Actual );
  	    
  	
  	
  }
  @AfterMethod
  public void logout()
  {
  	home.logout();
  	
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.quit();  
  }
  
}
