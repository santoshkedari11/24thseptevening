package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	
	//variable
		@FindBy (xpath ="//table//tr[1]//td[2]//div")
		private WebElement ForgotMessage;
		
		@FindBy (xpath ="(//input[@name=\'email\'])[2]")
		private WebElement emailOrPhoneNumber;
		
		@FindBy (xpath ="//a[text()='Cancel']")
		private WebElement CancelButton;
		
		@FindBy (xpath ="//button[text()='Search']")
		private WebElement SearchButton;
		
		
		//constructor
		public ForgotPassword (WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}
		
		//method
		
		public void GetTextMessage()
		{
			String Text=ForgotMessage.getText();
			System.out.println(Text);
		}
		
		public void enteremailOrPhoneNumber(String email)
		{
			emailOrPhoneNumber.sendKeys(email);
		}
		
		public void clickOnCancel()
		{
			CancelButton.click();
		}
		public void clickOnSearch()
		{
			SearchButton.click();
		}
}
