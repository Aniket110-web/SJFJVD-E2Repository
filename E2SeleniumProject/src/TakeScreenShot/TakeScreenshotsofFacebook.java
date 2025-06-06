package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotsofFacebook {

	public static void main(String[] args) throws IOException {
		
		String datetime = LocalDateTime.now().toString();
		String timestamp = datetime.replaceAll(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		//step 1: Type casting driver ref in takesscreenshot type
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//step 2: Capturing the capturing using getscreenshotAs()
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//step 3: Creating a new file to specify the path name and extension to store the screenshot
		File dest = new File("./screenshots/facebook"+timestamp+".png");
		
		//step 4: Copying and storing the screenshot by using copy() of filehandler class
		FileHandler.copy(src, dest);

	}

}
