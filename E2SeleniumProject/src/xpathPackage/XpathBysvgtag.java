package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBysvgtag {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		driver.findElement(By.xpath("//img[contains(@alt,'Motorola g45 5G (Brilliant Blue, 128 GB)')]/../../../../..//*[name()='svg']")).click();

	}

}
