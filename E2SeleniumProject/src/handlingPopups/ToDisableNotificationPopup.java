package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDisableNotificationPopup {

	public static void main(String[] args) {
		//Creating the object for ChromeOptions class
		ChromeOptions co = new ChromeOptions();
		//To disable the notification popup
		co.addArguments("--disable-notifications");
		
		//creating the object of ChromeDriver and passing the reference of ChromeOptions 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Declaring Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Launching the web Application
		driver.get("https://www.easemytrip.com/");
	}

}
