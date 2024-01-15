package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.action.Action;
import com.baseclass.Baseclass;

public class HomePage extends Baseclass
{
    @FindBy (xpath="//a[@class='panel-title collapsed'][normalize-space()='Account']")
    WebElement account;
    
    @FindBy (xpath="//a[normalize-space()='Purchases']")
    WebElement purchase;
    
    @FindBy (xpath="//a[normalize-space()='Extensions']")
    WebElement extension;
    
	@FindBy (xpath="//p[normalize-space()=\"Welcome to OpenCart!\"]")
	WebElement welcomeToOpencartText;
	  
	
    HomePage()
    {
      PageFactory.initElements(driver, this);
    }
    
    
    public void clickOnAccount()
    {
    	Action.clickOn(account);
    }
    
    
    public void clickOnPurchase()
    {
    	Action.clickOn(purchase);
    }
    
    
    public void clickOnExtension()
    {
       Action.clickOn(extension);
    }
    
    
    public boolean WelcomeToOpencartText_isPresent()
    {
       return Action.isDisplayed(welcomeToOpencartText);  
    }

    
}
