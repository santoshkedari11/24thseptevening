package testNGpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pomModule.ForgotPassword;
import pomModule.LoginOrSignUpPage;
import pomModule.SignUpForm;

public class TestClass1CrossBrowser extends Browser {
	 private WebDriver driver;
	 private LoginOrSignUpPage loginOrSignUpPage;
	 
     
	 @Parameters("browser123")
     @BeforeTest

    public void launchBrowser (String browser)
    {
   	 System.out.println("Before Class");
  
   	 if(browser.equals("Chrome"))
   	 {
   		driver = openChromeBrowser();
   	 }
   	 
   	 if(browser.equals("Firefox"))
   	 {
   		driver = openFirefoxBrowser();
   	 }
   	 
   	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   	 driver.manage().window().maximize();
    }
   
     @BeforeClass
     public void createPomObjects ()
     {
    	 loginOrSignUpPage = new LoginOrSignUpPage(driver);
    	 
     }
     
     @BeforeMethod
     public void openSignUpForm ()
     {
   	  driver.get("https://www.facebook.com/");
   	 loginOrSignUpPage.sendUserName("9902383668");
	 loginOrSignUpPage.sendPasswordName("powerofMIND");
	 loginOrSignUpPage.clickOnLoginButton();	
     }

     @Test
     public void test1() {
    	System.out.println("test 1"); 
    	 
    	 
     }
     @AfterMethod
     public void afterMethod ()
     {
   	  System.out.println("After Method");
   	   System.out.println("LogOut");
     }
     
     
     @AfterClass
     public void test123 ()
     {
    	 loginOrSignUpPage = null;
    	 
     }
     
     @AfterTest
     public void closedTheBrowser ()
     {
   	  driver.quit();
   	  driver = null;
   	  System.gc();
     }
     
     
}
