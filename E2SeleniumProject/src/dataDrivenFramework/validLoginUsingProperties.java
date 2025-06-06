package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginUsingProperties extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		driver.findElement(By.linkText("Log in")).click();
		
//		FileInputStream fis = new FileInputStream("./data/TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String email = prop.getProperty("email");
//		String password = prop.getProperty("password");
		
		//Creating object of Flib class
		Flib flib = new Flib();
		
		//Freyching email(data) from property file using readPropertyData method from Flib class
		String email = flib.readpropertyData(prop_path, "email");
		
		//Freyching password(data) from property file using readPropertyData method from Flib class
		String password = flib.readpropertyData(prop_path, "password");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
