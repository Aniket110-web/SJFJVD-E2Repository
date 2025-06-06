import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowsOrTabUsingTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cadbury.co.uk/");
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		String expectedTitle= "Nestlé: Good food, Good life | Nestlé Global";
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.morde.com/");
		Thread.sleep(1000);
		
		//Getting a addresses or IDs of all the windows or tabs
		Set<String> allWindowIDs= driver.getWindowHandles();
		
		//Fetching window IDs one by one
		for(String wi :allWindowIDs) 
		{
		//Switching the control to window id	
		driver.switchTo().window(wi);
		Thread.sleep(1000);
		//Fetching the actual Title of the page using getTitle()
		String actualTitle = driver.getTitle();
		
		//Comparing the actual and expected Title
		if(actualTitle.equals(expectedTitle))
		{
			break;
		}
		}
    
		driver.close();//Closing the desired Tab/Window

	}

}
