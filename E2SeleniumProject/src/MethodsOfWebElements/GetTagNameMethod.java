package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        
		driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(1000);
	    
	    WebElement emailTB=driver.findElement(By.id("Email"));
	    String emailTagname = emailTB.getTagName();
	    System.out.println(emailTagname);
	}

}
