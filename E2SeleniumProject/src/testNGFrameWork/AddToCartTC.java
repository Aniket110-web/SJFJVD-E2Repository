package testNGFrameWork;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGFrameWork.MyListner.class)
public class AddToCartTC extends BaseTest {

	@Test
	public void addToCartTC_001() throws IOException, InterruptedException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink();

		ElectronicsPage ep = new ElectronicsPage(driver);
		Thread.sleep(500);
		ep.getCellPhone().click();

		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneAddToCart().click();

		wp.getShoppingcartLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		if (sp.getSmartPhoneCartItem().isDisplayed()) 
		{
			//System.out.println("Product is Added To Cart !!!");
			Reporter.log("Product is Added To Cart !!!", true);
		} 
		else 
		{
			//System.out.println("Product is Not Added To Cart !!!");
			Reporter.log("Product is Not Added To Cart !!!", true);
		}
	}

}
