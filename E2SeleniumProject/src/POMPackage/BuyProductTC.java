package POMPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class BuyProductTC extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH,VALIDCREDS,  1, 0);
		String password = flib.readExcelData(EXCEL_PATH,VALIDCREDS,  1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, password);
		
		wp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhones().click();
		
		CellphonesPage cp = new CellphonesPage(driver);
		cp.getSmartPhoneAddToCartButtton().click();
		
		wp.getShoppingcartLink().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getCheckBoxForSmartPhone().click();
		
		scp.getTermsOfServiceCheckBox().click();
		scp.getCheckoutButton().click();
		
		String city = flib.readExcelData(EXCEL_PATH, BPD, 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH, BPD, 1, 1);
		String pincode = flib.readExcelData(EXCEL_PATH, BPD, 1, 2);
		String phone = flib.readExcelData(EXCEL_PATH, BPD, 1, 3);
		
		WorkLib wl = new WorkLib();
		int rn = wl.randomNumber();
		
		String phoneno = phone+rn;
		
		CheckOutPage cop = new CheckOutPage(driver);
		cop.BuyProductMethod(city, address1, pincode, phoneno);

	}

}
