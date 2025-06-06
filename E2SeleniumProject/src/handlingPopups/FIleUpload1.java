package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FIleUpload1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(500);
		
		WebElement fileUploadButton = driver.findElement(By.id("uploadfile"));
		
//		Actions act = new Actions(driver);
//		act.click(fileUploadButton).perform();
//		act.moveToElement(fileUploadButton).click().build().perform();
		
		fileUploadButton.sendKeys("C:\\Users\\admin\\Downloads\\Akshay Waghole (BA -UX Analyst).pdf");
		
	}

}
