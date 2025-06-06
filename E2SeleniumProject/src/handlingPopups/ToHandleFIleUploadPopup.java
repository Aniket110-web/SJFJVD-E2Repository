package handlingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFIleUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(500);
		
		WebElement fileUploadButton = driver.findElement(By.id("uploadfile"));
		
		Actions act = new Actions(driver);
		//act.click(fileUploadButton).perform();
		act.moveToElement(fileUploadButton).click().build().perform();
		
		Runtime.getRuntime().exec("./autoitPrograms/E2SeleniumProject/autoitPrograms/FileUploadPopup.exe");
		Thread.sleep(1000);
	}

}
