package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillParticularElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		
		//To typecast WebDriver Ref into JavascriptExecutor Interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//To fiond the Element till where we need to scroll
		WebElement elementToBeScrolled = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		Thread.sleep(1000);
		
		//To scroll till the desired WebElement
		jse.executeScript("arguments[0].scrollIntoView(false)",elementToBeScrolled);
	
	}

}
