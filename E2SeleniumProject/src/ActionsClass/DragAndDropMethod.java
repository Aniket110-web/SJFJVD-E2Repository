package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	//Finding the source Element
	WebElement osloCapitalSource = driver.findElement(By.id("box1"));
	// Getting the background colour of source element before dropping
	String beforeDropping = osloCapitalSource.getCssValue("background-color");
	System.out.println(beforeDropping);
	
	// Finding the target Element 
	WebElement norwayOsloTarget = driver.findElement(By.id("box101"));
	
	// Creating the object of Actions class
	Actions act = new Actions(driver);
	// To drag the source Element and drop into target Element
	act.dragAndDrop(osloCapitalSource, norwayOsloTarget).perform();
	Thread.sleep(500);
	
	// Getting the background color of source Element after dropping
	String afterDropping = osloCapitalSource.getCssValue("background-color");
	System.out.println(afterDropping);
	}

}
