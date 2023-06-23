package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.base.BaseClass;

public class LoginPage extends BaseClass {
    
@FindBy(xpath="//div[@class='oxd-form-row']//input[@name='username']") private WebElement UN;

@FindBy(xpath="//div[@class='oxd-form-row']//input[@type='password']") private WebElement PSW;

@FindBy(xpath="//button[@type='submit']") private WebElement LogBTN;


public LoginPage( )
{
	PageFactory.initElements(driver,this);
}

public void EnterUserName(String Username)
{
	UN.sendKeys(Username);
	
	
}

public void EnterPasssword(String Password)
{
	PSW.sendKeys(Password);
	
	
}

public void clickLogin()
{
	LogBTN.click();
	
	
}
}
