package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {

	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement SmartPhoneAddToCart;
//	@FindBy(xpath = "//a[text()='Phone Cover']/../..//input[@value='Add to cart']") private WebElement phoneCoverAddToCartButton;
	
	public CellPhonePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getSmartPhoneAddToCart() 
	{
		return SmartPhoneAddToCart;
	}

//	public WebElement getPhoneCoverAddToCartButton() 
//	{
//		return phoneCoverAddToCartButton;
//	}
	
	
	
}
