package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentAndIndependentElement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("img[alt='Picture for category Cell phones']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']/../../..//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
