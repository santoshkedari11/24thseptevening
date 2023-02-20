package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	//variable
	//@FindBy (xpath ="//input[@type=\'text\']")
	//private WebElement userName;
	
	//@FindBy (xpath ="//input[@type=\'password\']")
	//private WebElement pasword;
	
	@FindBy (xpath ="//button[text()='Log in']")
	private WebElement LoginButton;
	
	@FindBy (xpath ="//a[text()='Forgotten password?']")
	private WebElement forgottenPasswordLink;
	
	//variable
	@FindBy (xpath ="//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	@FindBy (xpath ="//a[text()='Create a Page']")
	private WebElement createPage;
	
	//constructor
	public LoginOrSignUpPage (WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	//method
	public void sendUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void sendPasswordName(String pass)
	{
		pasword.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
	public void openSignUpPage()
	{
		createNewAccount.click();
	}
	
	public void clickOnForgotPasswordLink()
	{
		forgottenPasswordLink.click();
	}
	
	public void clickOnCreateNewPage()
	{
		createPage.click();
	}

}
