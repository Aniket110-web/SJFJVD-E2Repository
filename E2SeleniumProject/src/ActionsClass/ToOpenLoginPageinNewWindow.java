package ActionsClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageinNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String expectedTitle = "Demo Web Shop. Login";
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		Thread.sleep(500);
		
		String parentWindowHandle = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		act.keyDown(loginLink,Keys.SHIFT).click().perform();
		Thread.sleep(500);
		
		act.keyUp(Keys.SHIFT).perform();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		allwindows.remove(parentWindowHandle);
		
		for(String wi:allwindows)
		{
			driver.switchTo().window(wi);
			
			String actualTitle = driver.getTitle();
			
			if(driver.getTitle().equals(expectedTitle)) 
			{
			break;
			}
		}
		driver.findElement(By.id("Email")).sendKeys("aniket@gmail.com");


	}

}
