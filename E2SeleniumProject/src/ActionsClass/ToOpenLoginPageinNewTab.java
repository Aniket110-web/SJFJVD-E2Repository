package ActionsClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageinNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Storing the Title of expecting Webpage
		String expectedTitle = "Demo Web Shop. Login";
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		Thread.sleep(500);
		
		//Fetching the address/Handle of parent tab
		String parentWindowHandle = driver.getWindowHandle();
		
		//Creating the object of Actions Class
		Actions act = new Actions(driver);
		
		//To press Control Button and click on login link
		act.keyDown(Keys.CONTROL).click(loginLink).perform();
		Thread.sleep(500);
		
		//To Release CONTROL Button
		act.keyUp(Keys.CONTROL).perform();
		
		//Fetching the address/Handle of all tabs
		Set<String> allwindows = driver.getWindowHandles();
		
		//To remove the address of parent tab
		allwindows.remove(parentWindowHandle);
		
		for(String wi:allwindows)
		{
			//To switch the CONTROL to the new Tab
			driver.switchTo().window(wi);
			
			//To fetch the TItle of the current page where control is present
			String actualTitle = driver.getTitle();
			
			//To compare and match the Titles
			if(driver.getTitle().equals(expectedTitle)) 
			{
			break;//To break the loop if Title is matched
			}
		}
		//To find email textbox present on the new tab and pass inputs
		driver.findElement(By.id("Email")).sendKeys("aniket@gmail.com");
	}

}
