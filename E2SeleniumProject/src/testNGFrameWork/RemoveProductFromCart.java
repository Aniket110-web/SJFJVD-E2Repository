package testNGFrameWork;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGFrameWork.MyListner.class)
public class RemoveProductFromCart extends BaseTest {

	@Test
	public void removeProduct() throws IOException, InterruptedException {
		WelcomePage wp = new WelcomePage(driver);
		
		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		Thread.sleep(500);
		ep.getCellPhone().click();

		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneAddToCart().click();

		wp.getShoppingcartLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getCheckBoxForSmartPhone().click();
		sp.getUpdateShoppingCartButton().click();
		
	}
}
