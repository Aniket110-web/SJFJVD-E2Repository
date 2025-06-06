package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//finding the target Element amd storing it in variable
		WebElement FashionElement = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		//Creating the object of actions class
		Actions act = new Actions(driver);
		
		//Performing mouse over actions over target web Element
		act.moveToElement(FashionElement).perform();
		
	}

}
