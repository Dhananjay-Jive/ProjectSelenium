package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span") private WebElement userName;
	
	@FindBy(xpath="(//ul[@class='oxd-dropdown-menu'])//a[text()='Logout']") private WebElement Logout;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyUserName()
	{
		 String uservalue=userName.getText();
		 System.out.println(uservalue);
		return uservalue;
		 
	}
	public void logout()
	{   userName.click();
		Logout.click();
	}
}
