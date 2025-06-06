package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Declaring Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Launching the web Application
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		
		//To get the Prompt Alert popup
		driver.findElement(By.id("buttonAlert1")).click();
		
		//To switch the control to prompt alert popup
		Alert promptAlert = driver.switchTo().alert();
		
		//To print the text present inside the prompt inside popup
		System.out.println(promptAlert.getText());
		Thread.sleep(1000);
		
		//To pass inputs in the popup by using sendkeys() of Alert interface
		promptAlert.sendKeys("yes");
		Thread.sleep(1000);
		
		//To click on 'OK' button
		//promptAlert.accept();
		
		//To click on 'Cancel' button
		promptAlert.dismiss();


	}

}
