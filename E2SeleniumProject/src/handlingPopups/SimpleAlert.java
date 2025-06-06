package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Declaring Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Launching the web Application
		driver.get("https://omayo.blogspot.com/");
		
		//To get the Alert popup
		driver.findElement(By.id("alert1")).click();

		//To switch the control to Alert popup
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//To print the Text present in the Popup
		System.out.println(simpleAlert.getText());
		
		//To click on OK button
		//simpleAlert.accept();
		
		// To CLick on OK button
		simpleAlert.dismiss();

	}

}
