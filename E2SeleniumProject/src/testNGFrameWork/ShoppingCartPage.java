package testNGFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath = "//input[@name='removefromcart']/../..//img[@alt='Pitcher of Smartphone']") private WebElement smartPhoneCartItem;
	@FindBy(xpath = "//a[text()='Smartphone'and @class='product-name']/../..//input[@name='removefromcart']") private WebElement checkBoxForSmartPhone;
	@FindBy(name = "updatecart") private WebElement updateShoppingCartButton;
	@FindBy(id = "termsofservice") private WebElement termsOfServiceCheckBox;
	@FindBy(id = "checkout") private WebElement checkoutButton;

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public void addToCartMethod() 
	{
		new WelcomePage(null);
	}

	public WebElement getCheckBoxForSmartPhone() {
		return checkBoxForSmartPhone;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	
	
}
