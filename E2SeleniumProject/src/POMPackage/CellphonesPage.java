package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphonesPage {
	
	//Declaration
	@FindBy(xpath="//img[@alt='Picture of Smartphone']") private WebElement smartphone;
	@FindBy(xpath="//img[@alt='Picture of Used phone']") private WebElement usedphone;
	@FindBy(xpath="//img[@alt='Picture of Phone Cover']") private WebElement phonecover;
	@FindBy(xpath="//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement SmartPhoneAddToCartButton;
	

	//Initialization
		public CellphonesPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Utilization

		public WebElement getSmartphone() {
			return smartphone;
		}


		public WebElement getUsedphone() {
			return usedphone;
		}


		public WebElement getPhonecover() {
			return phonecover;
		}


		public WebElement getSmartPhoneAddToCartButtton() {
			return SmartPhoneAddToCartButton;
		}
		
			
}
