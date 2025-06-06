package testNGFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	
	@FindBy(id = "Email") private WebElement emailTB;
	@FindBy(id = "Password") private WebElement pwdTB;
	@FindBy(id = "RememberMe") private WebElement rememberMeCheckBox;
	@FindBy(linkText = "Forgot password?") private WebElement forgotPasswordLink;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;
	
	//Reinitialization
	
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		
	//Utilization
		public WebElement getEmailTB() {
			return emailTB;
		}

		public WebElement getPwdTB() {
			return pwdTB;
		}

		public WebElement getRemembermeCB() {
			return rememberMeCheckBox;
		}

		public WebElement getForgopasstLink() {
			return forgotPasswordLink;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		public void validLoginMethod(String email, String password) throws InterruptedException 
		{
			emailTB.sendKeys(email);
			Thread.sleep(500);
			pwdTB.sendKeys(password);
			Thread.sleep(500);
			loginButton.click();
		}
		
		public void invalidLoginMethod(String email, String password) throws InterruptedException 
		{
			emailTB.sendKeys(email);
			Thread.sleep(500);
			pwdTB.sendKeys(password);
			Thread.sleep(500);
			loginButton.click();
			Thread.sleep(500);
			
			emailTB.clear();
			pwdTB.clear();
			Thread.sleep(1000);
		}
	
		
}
