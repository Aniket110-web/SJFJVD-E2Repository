package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebookByXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aniketgoinjari1@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pass@10");
		Thread.sleep(1000);
		
		driver.findElement(By.id("loginbutton"));
		driver.quit();
		

	}

}
