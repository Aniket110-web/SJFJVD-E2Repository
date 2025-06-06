package testNGFrameWork;

import java.io.IOException;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt= new BaseTest();
		bt.browserSetup();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
		
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTB().sendKeys(email);
		lp.getPwdTB().sendKeys(pwd);
		lp.getLoginButton().click();
	}
}
