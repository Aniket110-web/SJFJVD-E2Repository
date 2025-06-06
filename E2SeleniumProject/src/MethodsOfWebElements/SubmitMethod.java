package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink=driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(1000);
		
		WebElement emailTB=driver.findElement(By.id("Email"));
		emailTB.sendKeys("aniket@gmail.com");
		Thread.sleep(1000);
		
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.submit();

	}

}
