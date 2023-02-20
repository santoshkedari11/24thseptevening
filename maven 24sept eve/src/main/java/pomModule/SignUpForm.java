package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpForm {

	//variable
		@FindBy (xpath ="//input[@name=\'firstname\']")
		private WebElement firstName;
		
		@FindBy (xpath ="//input[@name=\'lastname\']")
		private WebElement lastName;
		
		@FindBy (xpath ="(//input[@class='inputtext _58mg _5dba _2ph-'][3])")
		private WebElement emailId;
		
		@FindBy (xpath ="//input[@id=\'password_step_input\']")
		private WebElement newPassword;
		
		@FindBy (xpath ="//select[@id=\\'day\\']")
		private WebElement dayOfBirth;
		
		@FindBy (xpath ="//select[@id='month']")
		private WebElement monthOfBirth;
		
		@FindBy (xpath ="//select[@id=\\'year\\']")
		private WebElement YearOfBirth;
		
		@FindBy (xpath ="(//input[@type=\'radio\'][1])")
		private WebElement femaleRadioButton;
		
		@FindBy (xpath ="(//input[@type=\"radio\"][2])")
		private WebElement maleRadioButton;
		
		@FindBy (xpath ="(//input[@type=\"radio\"][3])")
		private WebElement customRadioButton;
		
		@FindBy (xpath ="(//button[text()='Sign Up'][1])")
		private WebElement signUpButton;
		
		@FindBy (xpath ="//a[@id='privacy-link']")
		private WebElement privacy;
		
		@FindBy (xpath ="//a[@id=\'terms-link\']")
		private WebElement terms;
		
		//@FindBy (xpath ="//a[@id=\'cookie-use-link\']")
		@FindBy (xpath ="//a[@id=\'cookie-use-link123\']")
		private WebElement cookies;
		
		//constructor
		public SignUpForm (WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}
		
		
		//method
		public void sendFirstName(String name)
		{
			
			firstName.sendKeys(name);
		}
		
		public void sendLastName(String name)
		{
			lastName.sendKeys(name);
		}
		
		public void sendemailOrMobileNumber(String emailOrPhone)
		{
			emailId.sendKeys(emailOrPhone);
		}
		
		public void sendNewPassword(String password)
		{
			newPassword.sendKeys(password);
		}
		
		public void selectDayOfBirth(String name)
		{
			dayOfBirth.sendKeys(name);
		}
		
		public void selectMonthOfBirth(String name)
		{
			monthOfBirth.sendKeys(name);
		}
		
		public void selectYearOfBirth(String name)
		{
			YearOfBirth.sendKeys(name);
		}
		
		
		public void selectFemaleRadioButton()
		{
			femaleRadioButton.click();
		}
		
		public void selectMaleRadioButton()
		{
			maleRadioButton.click();
		}
		
		
		public void selectCustomRadioButton()
		{
			customRadioButton.click();
		}
		
		
		public void clickOnsignUpButton()
		{
			signUpButton.click();
		}
		
		public void clickOnTerms()
		{
			terms.click();
		}
		
		public void clickOnPrivacy()
		{
			privacy.click();
		}
		
		public void clicOncookies()
		{
			cookies.click();
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

