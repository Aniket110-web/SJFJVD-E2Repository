package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement rememberMeCheckbox = driver.findElement(By.id("RememberMe"));
		
		if(rememberMeCheckbox.isSelected())
		{
			System.out.println("Remember me checkbox is already selected");
		}
		else
		{
			rememberMeCheckbox.click();
		}

	}

}
