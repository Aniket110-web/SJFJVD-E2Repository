package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;

import genericPackage.BaseTest;
import genericPackage.Flib;
import genericPackage.WorklLib;
import pomPackage.CellPhonePage;
import pomPackage.CheckOutPage;
import pomPackage.ElectronicsPage;
import pomPackage.LoginPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

@Listeners(genericPackage.MyListner.class)
public class BuyProductTest extends BaseTest {

	public static void buyProduct() throws IOException, InterruptedException {
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		Flib flib = new Flib();
		String email = flib.readExcelData(TEST_EXCEL_PATH, VALIDCREDS, 1, 0);
		String password = flib.readExcelData(TEST_EXCEL_PATH, VALIDCREDS, 1, 1);

		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, password);

		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		Thread.sleep(500);
		ep.getCellPhone().click();

		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneAddToCart().click();

		wp.getShoppingcartLink().click();

		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getCheckBoxForSmartPhone().click();
		
		scp.getTermsOfServiceCheckBox().click();
		scp.getCheckoutButton().click();
		
		String city=flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 0);
		String address1=flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 1);
		String pincode=flib.readNumericExcelData(TEST_EXCEL_PATH, BPD, 1, 2);
		String phone=flib.readNumericExcelData(TEST_EXCEL_PATH, BPD, 1, 3);
		
		WorklLib wl = new WorklLib();
		int rn = wl.randomNumber();
		
		String phoneNo = phone+rn;
		
		CheckOutPage cop = new CheckOutPage(driver);
		cop.buyProductMethod(city, address1, pincode, phoneNo);
		
		
	}

	
}
