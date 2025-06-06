package MockTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/admin/Downloads/Assign.html");
		
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		Set<String> allWindowID = driver.getWindowHandles();
		Thread.sleep(1000);
		
		String expectedTitle = "Order Food & Groceries. Discover the best restaurants. Swiggy it!";
		
		for(String wi:allWindowID)
		{
			driver.switchTo().window(wi);
			
			String actualTitle = driver.getTitle();
				Thread.sleep(1000);
			if(actualTitle.endsWith(expectedTitle))
			{
				driver.close();
				break;
			}
		}

		
	}

}
