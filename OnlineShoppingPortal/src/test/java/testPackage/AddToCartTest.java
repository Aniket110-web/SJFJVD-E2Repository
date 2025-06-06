package testPackage;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import pomPackage.CellPhonePage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

//@Listeners(testNGFrameWork.MyListner.class)
public class AddToCartTest extends BaseTest {

	@Test
	public void addToCartTC_001() throws IOException, InterruptedException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();;

		ElectronicsPage ep = new ElectronicsPage(driver);
		Thread.sleep(500);
		ep.getCellPhone().click();

		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneAddToCart().click();

		wp.getShoppingcartLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		if (sp.getCheckBoxForSmartPhone().isDisplayed()) 
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
