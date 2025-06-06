package handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleChildBrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Declaring Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Launching the web Application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(500);
		
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		String expectedTitle="New Window";
		
		for(String wi:allWindowIDs) 
		{
		driver.switchTo().window(wi);
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{		
			break;	
		}
		}
		String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		Thread.sleep(3000);
		System.out.println(text);
	}

}
