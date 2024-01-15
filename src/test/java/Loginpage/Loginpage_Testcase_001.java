package Loginpage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.WelcomePage;

public class Loginpage_Testcase_001 extends Baseclass
{
	WelcomePage welcomePage;
	LoginPage loginPage;
	HomePage homepage;
	
	@BeforeMethod()
	public void setup() throws IOException
	{
	  main();
	}
	
	//@AfterMethod()
	public void setOff()
	{
		driver.quit();
	}

   @Test
   public void loginTest()
   {     
	   welcomePage=new WelcomePage(driver);
   LoginPage s = welcomePage.clickOnLogin();
   s.enterEmailAdress("s");
        

   }		
   
   
   
   
}
