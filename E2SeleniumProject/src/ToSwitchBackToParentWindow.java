import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(1000);
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.phonepe.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(1000);
		
		driver.close();
	}

}
