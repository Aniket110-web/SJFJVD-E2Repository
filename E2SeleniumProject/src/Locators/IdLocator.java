package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("Aniket");
		Thread.sleep(1000);
		
		WebElement passwordbox = driver.findElement(By.id("pass"));
		passwordbox.sendKeys("Aniket@09");
		Thread.sleep(1000);

	}

}
