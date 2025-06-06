package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllignmentverificationOfFaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		WebElement emailTB=driver.findElement(By.id("email"));
		Thread.sleep(1000);
		
		Rectangle rect = emailTB.getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		
		System.out.println("Widthemail is :"+width+" Heightemail is :"+height+" X-Axisemail is :"+xaxis+" Y-Axisemail is : "+yaxis);
		
		WebElement passwordTB = driver.findElement(By.id("pass"));
		Thread.sleep(1000);
		
		Rectangle rect2 = passwordTB.getRect();
		int width2 = rect2.getWidth();
		int height2 = rect2.getHeight();
		int xaxis2 = rect2.getX();
		int yaxis2 = rect2.getY();
		
		System.out.println("Widthpass is :"+width2+" Heightpass is :"+height2+" X-Axispass is :"+xaxis2+" Y-Axispass is : "+yaxis2);

	}

}
