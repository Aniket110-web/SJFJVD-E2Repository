package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("img[alt='Picture for category Cell phones']")).click();

	}

}
