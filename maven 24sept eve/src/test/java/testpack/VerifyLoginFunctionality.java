package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModule.LoginOrSignUpPage;

public class VerifyLoginFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		// step 1 open the browser and enter the url
				System.setProperty("webdriver.chrome.driver","C:\\salenium\\chrome\\chromedriver.exe");
				WebDriver driverTest = new ChromeDriver();
				driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driverTest.manage().window().maximize();
				driverTest.get("https://www.facebook.com/");
		
		// step 2 verify Username and Password
				
				LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
				loginOrSignUpPage.sendUserName("9902383668");
				loginOrSignUpPage.sendPasswordName("powerofMIND");
				
		// step 3 Click on Login Button
				
				loginOrSignUpPage.clickOnLoginButton();	
				
				Thread.sleep(1000);
		// step 4 verify Home Page URL and Title
		
		// home Page POM Class Object
				String title=driverTest.getTitle();
				String url=driverTest.getCurrentUrl();
				
				System.out.println(title);
				System.out.println(url);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
