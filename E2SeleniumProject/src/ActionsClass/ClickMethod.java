package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//finding the webelement and storing it into variable
		WebElement uploadfileButton = driver.findElement(By.id("uploadfile"));
		
		//Trying to click on WebElement by using click() of WebElemement Interface
		//uploadfileButton.click();----> Not Working 
		
		//Creating the object of Actions class
		Actions act = new Actions(driver);
		
		//To perform click operation using click() of Actions Class
		//act.moveToElement(uploadfileButton).click().perform();
				
		//To perform click Operation using click(WebElement target) of Actions Class
		act.click(uploadfileButton).perform();

	}

}
