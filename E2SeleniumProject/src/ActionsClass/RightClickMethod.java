package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(1000);
		
		WebElement button1 = driver.findElement(By.id("btn30"));
		
		WebElement button2 = driver.findElement(By.id("btn31"));
		
		WebElement button3 = driver.findElement(By.id("btn32"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(button1).contextClick().perform();// Performing right click operation on Bbutton1
		driver.findElement(By.xpath("//div[text()='Yes']")).click();//Selecting yes option
		Thread.sleep(500);
		// Capturing the message after selecting yes option
		WebElement message1 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(message1.getText());// Printing the captured message
		Thread.sleep(500);
		
		act.contextClick(button2).perform();// Performing right click operation on Bbutton2
		driver.findElement(By.xpath("//div[text()='No']")).click();//Selecting NO option
		Thread.sleep(500);
		// Capturing the message after selecting NO option
		WebElement message2 = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		System.out.println(message2.getText());// Printing the captured message
		Thread.sleep(500);
		
		act.contextClick(button3).perform();// Performing right click operation on Bbutton3
		driver.findElement(By.xpath("//div[text()='5']")).click();//Selecting rating as 5
		Thread.sleep(500);
		// Capturing the message after selecting rating as 5
		WebElement message3 = driver.findElement(By.xpath("//span[text()='You selected \"5\"']"));
		System.out.println(message3.getText());// Printing the captured message
		Thread.sleep(500);
	}

}
