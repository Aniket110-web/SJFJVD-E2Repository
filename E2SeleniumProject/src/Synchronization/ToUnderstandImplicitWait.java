package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		
		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(.,'Login ')]"));
		loginButton.click();
	}

}
