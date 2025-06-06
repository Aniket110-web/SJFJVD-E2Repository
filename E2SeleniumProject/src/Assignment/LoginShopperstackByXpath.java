package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginShopperstackByXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("aniket@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@niket1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
