package RedberylTechSolutions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBerylTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.redberyltech.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Actions act = new Actions(driver);
	
	driver.findElement(By.linkText("Contact Us")).click();

	WebElement nameTB = driver.findElement(By.id("formName"));
	nameTB.sendKeys("Aniket");
	
	WebElement emailTB = driver.findElement(By.id("formEmail"));
	emailTB.sendKeys("Ani@gmail.com");
	
	WebElement phoneNumberTB = driver.findElement(By.id("formPhone"));
	phoneNumberTB.sendKeys("9876543210");
	
	WebElement dropD = driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
	act.moveToElement(dropD).click().perform();
	WebElement messageTB = driver.findElement(By.name("message"));
	messageTB.sendKeys("Red Beryl Hiring Test");
	
	Object sendButton = driver.findElement(By.xpath("//button[text()='Send Message']"));
	jse.executeScript("arguments[0].click();",sendButton );
	Thread.sleep(4000);
	
	WebElement location = driver.findElement(By.className("contact-action-link"));
	location.click();
	driver.navigate().back();
	
//	driver.findElement(By.xpath("//p[text()='+91 76669 87829']")).click();
//	Alert confirmationAlert = driver.switchTo().alert();
//	confirmationAlert.accept();
	
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/RedberylTech']")).click();
	driver.navigate().back();
	
	driver.findElement(By.xpath("https://www.instagram.com/info.redberyl.tech/")).click();
	driver.navigate().back();
	
	driver.findElement(By.xpath("//a[@href='https://x.com/RedberylTech']")).click();
	driver.navigate().back();
	}

}
