package testNGFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CheckOutPage {

	@FindBy(id = "BillingNewAddress_CountryId")private WebElement countryIdDD;
	@FindBy(id = "billing-address-select")private WebElement billingAadressOldAddressDD;
	@FindBy(id = "BillingNewAddress_City")private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1")private WebElement addressTB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber")private WebElement phoneNoTB;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")private WebElement billingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")private WebElement paymentInformationContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")private WebElement confirmOrderContinueButton;
	@FindBy(xpath = "//input[@onclick='setLocation('/')']")private WebElement lastContinueButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")private WebElement orderConfirmMessage;
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")private WebElement confirmationMessage;
	// Ini

	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCountryIdDD() {
		return countryIdDD;
	}

	public WebElement getBillingAadressOldAddressDD() {
		return billingAadressOldAddressDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddressTB() {
		return addressTB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInformationContinueButton() {
		return paymentInformationContinueButton;
	}

	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}

	public WebElement getLastContinueButton() {
		return lastContinueButton;
	}

	public WebElement getOrderConfirmMessage() {
		return orderConfirmMessage;
	}

	
	//Operational Method
	public void buyProductMethod(String city,String address,String pincode,String phoneNo) 
	{
		WorklLib wl = new WorklLib();
		
		if(countryIdDD.isDisplayed()) 
		{
			wl.selectByVisibleText(countryIdDD, "India");
		}
		else 
		{
			wl.selectByVisibleText(billingAadressOldAddressDD, "New Address");
		}
		wl.selectByVisibleText(countryIdDD, "India");
		
		cityTB.sendKeys(city);
		addressTB.sendKeys(address);
		pincodeTB.sendKeys(pincode);
		phoneNoTB.sendKeys(phoneNo);
		
		
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInformationContinueButton.click();
		confirmOrderContinueButton.click();
				
		if(confirmationMessage.isDisplayed()) 
		{
			Reporter.log("Product has been Placed Successfully !!!", true);
		}
		else 
		{
			Reporter.log("Product is Not Placed !!!", true);
		}
		
	}
	
}
