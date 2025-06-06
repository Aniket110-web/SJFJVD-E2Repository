package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
				
				//creating the object of ChromeDriver and passing the reference of ChromeOptions 
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//Declaring implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Declaring Explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				
				//Launching the web Application
				driver.get("https://www.easemytrip.com/");
				Thread.sleep(5000);
				
				//Creating the object of Robot class
				Robot robot = new Robot();
				
				//To press 'TAB' key
				robot.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(500);
				
				//To release 'TAB' key
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);
				
				//To press 'Enter' key
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(500);
				
				//To release 'Enter' key
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(500);
	}

}
