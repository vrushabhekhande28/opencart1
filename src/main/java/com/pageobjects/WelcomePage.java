package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.action.Action;
import com.baseclass.Baseclass;

public class WelcomePage extends Baseclass
{
	
	
   @FindBy (xpath="//a[@class='btn btn-link navbar-btn']")
   WebElement login;
   
   @FindBy (xpath="//a[@class='btn btn-black navbar-btn']")
   WebElement register;
  
   
  public WelcomePage(WebDriver driver)
  {   
	  PageFactory.initElements(driver, this);
  }
  
  public LoginPage clickOnLogin()
  {
	Action.clickOn(login);
     return new LoginPage(driver);
  }

  public RegisterPage clickOnRegister()
  {
	 Action.clickOn(register);
	 return new RegisterPage();
  }

  
  
  
  
}
