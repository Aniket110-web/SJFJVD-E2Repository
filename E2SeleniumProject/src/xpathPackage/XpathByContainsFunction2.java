package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunction2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@title,'Brilliant Green, 128 GB')]")).click();

	}

}
