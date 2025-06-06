package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(1000);
		
		WebElement emailTB=driver.findElement(By.id("email"));
		
		Dimension size=emailTB.getSize();
		
		int width=size.getWidth();
		int height=size.getHeight();
		
		System.out.println("Width of TB is :"+width+" Height of TB is :"+height+"");
	}

}
