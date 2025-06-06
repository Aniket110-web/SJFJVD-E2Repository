package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshotofWebElement {

	public static void main(String[] args) throws IOException {
		String datetime = LocalDateTime.now().toString();
		String timestamp = datetime.replaceAll(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		//Locating the WebElement and storing it in variable
		WebElement loginButton = driver.findElement(By.name("login"));
		
		//capturing the screenshots of WebElement by accessing getscreenshotAs() through ref var of WE
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		
		//Creating new file and specifying path name and extension to store the screenshot
		File dest = new File("./screenshot/FbLoginBytton"+timestamp+".png");
		
		//Copying and storing the screenshot by using copy() om.google.commom.io.Files package
		Files.copy(src, dest);

	}

}
