package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHsndleDisabledTextbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		//Finding the Disabled element and stoting it
		WebElement disabledTB = driver.findElement(By.id("tb2"));
		Thread.sleep(1000);
		
		//Typecasting Webdriver's Ref into JavascriptExedutor Interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//To pass inputs into Disabled Textbox
		//jse.executeScript("document.getElementById('tb2').value='Aniket'");
		
		//To pass inputs into disabled Textbox
		jse.executeScript("arguments[0].value='Aniket'", disabledTB);
	}

}
