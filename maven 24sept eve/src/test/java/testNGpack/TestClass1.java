package testNGpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomModule.LoginOrSignUpPage;
import pomModule.SignUpForm;

public class TestClass1 {

	              private WebDriver driver;
	            
	              @BeforeClass
	
	             public void launchBrowser ()
	             {
	            	 System.out.println("Before Class");
	            	 
	            	 System.setProperty("webdriver.chrome.driver","C:\\salenium\\chrome\\chromedriver.exe");
	            	 
	            	 driver = new ChromeDriver();
	            	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	            	 driver.manage().window().maximize();
	             }
	
	              @BeforeMethod
	              public void openSignUpForm ()
	              {
	            	  driver.get("https://www.facebook.com/");
	            	  LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage(driver);
	            	  loginOrSignUpPage.openSignUpPage();
	              }
	
	              @Test
			     	
	 	         public void verifyTermLinkOnSignUpPage ()
	 	         {
	            	  SignUpForm signUpForm=new SignUpForm(driver);
	            	  signUpForm.clickOnTerms();
	            	  
	            	  ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
	            	  driver.switchTo().window(addr.get(1));
	            	  
	            	  String expectedURL = "https://www.facebook.com/legal/terms/update";
	            	  String actualURL = driver.getCurrentUrl();
	            	  
	            	  if(expectedURL.equals(actualURL))
	            	  {
	            		   
	            		  System.out.println("pass");
	            	  }
	            	  else
	 	        	 
	            	  {
	            		   
	            		  System.out.println("fail");
	            	  }
	 	        	 
	 	         }
	
	              @Test
			     	
		 	         public void verifyPolicyLinkOnSignUpPage ()
		 	         {
		            	  SignUpForm signUpForm=new SignUpForm(driver);
		            	  signUpForm.clickOnPrivacy();
		            	  
		            	  ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		            	  driver.switchTo().window(addr.get(1));
		            	  
		            	  String expectedURL = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		            	  String actualURL = driver.getCurrentUrl();
		            	  
		            	  if(expectedURL.equals(actualURL))
		            	  {
		            		   
		            		  System.out.println("pass");
		            	  }
		            	  else
		 	        	 
		            	  {
		            		   
		            		  System.out.println("fail");
		            	  }
		 	        	 
		 	         }
	
	              @Test
			     	
		 	         public void verifySignUpPage ()
		 	         {
	            	  SignUpForm signUpForm=new SignUpForm(driver);
		            	  signUpForm.clicOncookies();
		            	  
		            	  ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		            	  driver.switchTo().window(addr.get(1));
		            	  
		            	  String expectedURL = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
		            	  String actualURL = driver.getCurrentUrl();
		            	  
		            	  if(expectedURL.equals(actualURL))
		            	  {
		            		   
		            		  System.out.println("pass");
		            	  }
		            	  else
		 	        	 
		            	  {
		            		   
		            		  System.out.println("fail");
		            	  }
		 	        	 
		 	         }
	
	
	              @Test
			     	
		 	         public void verifySignUpForm ()
		 	         {
	            	  SignUpForm signUpForm=new SignUpForm(driver);
	            	  signUpForm.sendFirstName("santosh");
	            	  signUpForm.sendLastName("kedari");
	            	  signUpForm.sendemailOrMobileNumber("santosh.kedari47@gmail.com");
	            	  signUpForm.sendNewPassword("powerofMIND1");
	            	  signUpForm.selectDayOfBirth("11");
	            	  signUpForm.selectMonthOfBirth("Nov");
	            	  signUpForm.selectYearOfBirth("1989");
	            	  signUpForm.selectMaleRadioButton();
	            	  signUpForm.clickOnsignUpButton();
	            	  
	            	  String expectedURL = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
	            	  String actualURL = driver.getCurrentUrl();
	            	  
	            	  if(expectedURL.equals(actualURL))
	            	  {
	            		   
	            		  System.out.println("pass");
	            	  }
	            	  else
	 	        	 
	            	  {
	            		   
	            		  System.out.println("fail");
	            	  }
	            	  
		 	         }
	              

	              @AfterMethod
	              public void goBackToMainPage ()
	              {
	            	  ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
	            	  driver.switchTo().window(addr.get(0));
	              }
	              
	              @AfterClass
	              public void closedTheBrowser ()
	              {
	            	  driver.quit();
	              }
	              
	              
	              
}
