package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {

	//declaration
	@FindBy(xpath="//img[@alt='Picture for category Camera, photo']") private WebElement camera;
	@FindBy(xpath="//img[@alt='Picture for category Cell phones']") private WebElement Cellphones;
	
	//Initialization
	public ElectronicsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getcamera() {
		return camera;
	}

	public WebElement getCellPhones() {
		return Cellphones;
	}
	
}