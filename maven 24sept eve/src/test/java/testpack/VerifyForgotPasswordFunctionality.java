package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModule.ForgotPassword;
import pomModule.LoginOrSignUpPage;

public class VerifyForgotPasswordFunctionality {

	public static void main(String[] args) {
		
		// step 1 open the browser and enter the url
		System.setProperty("webdriver.chrome.driver","C:\\salenium\\chrome\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.facebook.com/");
		
		// step 2 click on forget password link
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.clickOnForgotPasswordLink();
		
		// step 3 verify the text
		ForgotPassword forgotPassword = new ForgotPassword(driverTest);
		forgotPassword.GetTextMessage();
		
		// step 4 enter the emailid
		forgotPassword.enteremailOrPhoneNumber("santosh");
		
		// step 5 click on search button
		forgotPassword.clickOnSearch();
		
		String title=driverTest.getTitle();
		String url=driverTest.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(url);

	}
}
