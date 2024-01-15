package com.action;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass;

public class Action extends Baseclass
{
   // click on th element
	
	
	  public static boolean normalClick(WebElement we) {
	        boolean output = true;
	        try 
	        {
	            we.click();
	        } catch (Exception ae) {
	            output = false;
	            ae.printStackTrace();
	        } finally 
	        {
	        	
	        }
	        return output;
	    }
   
   // scroll by javascript
    public static boolean scrollByVisibiltyOFElement(WebDriver driver, WebElement we )
    {
      boolean output=true;    	
    	try
    	{
    	JavascriptExecutor  js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", we);
    	output=true;    
    	return output;
    	}
    	catch(Exception ae)
    	{
    		output=false;
    		return output;
    	}
    	finally
    	{
    		System.out.println(output ? "Sucessfully Scrolled Upto Element" : "Something wents wrong" );
    	}
    }
    
    // Is Displayed method 
    public static boolean scrollByVisibilityOfElement(WebDriver driver, WebElement we) {
        boolean output = true;
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", we);
        } catch (Exception ae) {
            output = false;
            ae.printStackTrace();
        } finally {
            //logActionStatus(output, "Successfully Scrolled Up to Element", "Something went wrong");
        }
        return output;
    }
    
    //Impliitewait
    
    // Implicit wait
    public static void implicitlyWait(WebDriver driver) {
        String time = prop.getProperty("time");
        int timeForImplicit = Integer.parseInt(time);
        System.out.println("wait for :" + timeForImplicit);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeForImplicit));
    }
    
    
    //sendkeys
    
    public static void sendKeys(WebElement we, String text) {
        boolean success = true;
        try {
            //we.clear();
            we.sendKeys(text);
        } catch (Exception ae) {
            ae.printStackTrace();
            success = false;
        } finally {
            //logActionStatus(success, "Text Entered Successfully", "Text Not Entered");
        }
    }
    
    // Click on
    public static void clickOn(WebElement we) {
        boolean success = true;
        try {
            we.click();
        } catch (Exception ae) {
            success = false;
            ae.printStackTrace();
        } finally {
           // logActionStatus(success, "Click Successfully", "Something Went Wrong");
        }
    }
     
 // Is Displayed method
    public static boolean isDisplayed(WebElement we) {
        try {
            return we.isDisplayed();
        } catch (Exception ae) {
            return false;
        }
    }

}
