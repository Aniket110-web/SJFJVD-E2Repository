package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(1000);
		
		//Finding the WebElement to click and Hold and then Release
		WebElement clickAndHoldElement = driver.findElement(By.xpath("//div[@id='circle']"));
		Thread.sleep(2000);
		
		//Creating the object of Actions class
		Actions act = new Actions(driver);
		
		//To click and Hold the Element for 3 seconds using parameterized method
		act.moveToElement(clickAndHoldElement).clickAndHold().perform();
		Thread.sleep(3000);
		
		//To release the Element ehich is held using parameterized method
		act.moveToElement(clickAndHoldElement).release().perform();
		
		//To click and Hold the Element for 3 seconds using non-parameterized method
		act.clickAndHold(clickAndHoldElement).perform();
		Thread.sleep(3000);
		
		//To release the Element ehich is held using non-parameterized method
		act.release(clickAndHoldElement).perform();
	}

}
