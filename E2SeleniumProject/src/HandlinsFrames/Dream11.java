package HandlinsFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.dream11.com/");
	
	//To switch the frame by using the index of the frame
	//driver.switchTo().frame(0);
	
	//To switch the frame by using the value or name or id attribute
	//driver.switchTo().frame("send-sms-iframe");
	
	//To find frame by using xpath
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
	
	//To switch the frame by passing the reference of the located frame
	driver.switchTo().frame(frameElement);
	
	//To pass inputs to the element present inside the frame
	driver.findElement(By.id("regEmail")).sendKeys("7841858600");
	
	//To switch the control one frame out
	//driver.switchTo().parentFrame();
	
	//To switch the control out of all the frames
	driver.switchTo().defaultContent();
	
	//To verify if the control has switched back to the main webpage
	driver.findElement(By.id("select-selected")).click();
	

	}

}
