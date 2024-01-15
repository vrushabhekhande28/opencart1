package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.action.Action;
import com.baseclass.Baseclass;

public class LoginPage extends Baseclass
{
	 @FindBy (xpath="//input[@name='email']")
	  WebElement email;
	  
	  @FindBy (xpath="//input[@id='input-password']")
	  WebElement password;
	  
	  @FindBy (xpath="//button[@class=\"btn btn-primary btn-lg hidden-xs\"]")
	  WebElement logibButton;
	  

	  LoginPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void enterEmailAdress(String EmailAdress)
	  {
		Action.sendKeys(email, EmailAdress);
	  }
	  
	  public void enterpassword(String pass)
	  {
		  password.sendKeys(pass);
		  Action.sendKeys(password, pass);
	  }
	  
	  public HomePage loginToOpencart()
	  {
		  Action.sendKeys(email, prop.getProperty("email"));
		  Action.sendKeys(password, prop.getProperty("password"));	
		  Action.clickOn(logibButton);
		  return new HomePage();
	  }
	  
     public HomePage clickOnLoginButton()
     {
    	 Action.clickOn(logibButton);
    	 return new HomePage();
     }
  
}
