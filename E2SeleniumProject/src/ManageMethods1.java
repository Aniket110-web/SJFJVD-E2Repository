import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods1 {
	public static void main (String []args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// steps to perform maximize operation on browser window
		//Options ops = driver.manage();
		//Window wi = ops.window();
		//wi.maximize();
		
		driver.manage().window().maximize(); // to maximize the window
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		driver.manage().window().minimize(); //to minimize the window
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen(); // to open browser in full screen mode
	}

}
