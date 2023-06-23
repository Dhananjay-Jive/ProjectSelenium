package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.base.BaseClass;

public class AdminPage extends BaseClass {
   @FindBy(xpath="//div[@class='oxd-table-filter']//input[@class='oxd-input oxd-input--active']") private WebElement UserName;
   @FindBy(xpath="(//div[@class='oxd-table-filter']//div[@class='oxd-select-text oxd-select-text--active'])[1]") private WebElement UserRole;
   @FindBy(xpath="//div[@class='oxd-table-filter']//input[@Placeholder='Type for hints...']") private WebElement EmpName;
   @FindBy(xpath="(//div[@class='oxd-table-filter']//div[@class='oxd-select-text oxd-select-text--active'])[2]") private WebElement Status;
   
   
   AdminPage()
   {
	  PageFactory.initElements(driver, this); 
	   
   }
   public void EnteUserName(String username)
    {
	  UserName.sendKeys(username); 
    }
   
   
}
