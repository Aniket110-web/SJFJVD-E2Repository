package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Declaring Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Launching the web Application
		driver.get("https://omayo.blogspot.com/");
		
		//To get the Confirmation Alert popup
		driver.findElement(By.id("confirm")).click();
		
		// To switch the control to confirmation alert popup
		Alert confirmationAlert = driver.switchTo().alert();
		
		// To get the text present inside the popup
		System.out.println(confirmationAlert.getText());
		Thread.sleep(1000);
		
		// To accept or click on 'OK' button
		confirmationAlert.accept();
	}

}
