package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class RegisterPage extends Baseclass
{
  @FindBy (xpath="//input[@id='input-username']")
   WebElement  username;
  
  @FindBy (xpath="//input[@name='firstname']")
  WebElement firstName;
  
  @FindBy (xpath="//input[@id='input-lastname']")
  WebElement lastName;
  
  @FindBy (xpath="//input[@id='input-email']")
  WebElement email;
  
  RegisterPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  
}
