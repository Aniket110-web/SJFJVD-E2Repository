package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		//Finding the target Element to Scroll
		WebElement targetElement = driver.findElement(By.linkText("District"));
		Thread.sleep(1000);
		
		//Creating the object of Actions class
		Actions act = new Actions(driver);
		
		// Performing scrolling 
		act.scrollToElement(targetElement).perform();
	}

}
