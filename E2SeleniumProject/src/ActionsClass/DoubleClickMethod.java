package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Finding WebElement and storing it in a variable
		WebElement doubleClickTarget = driver.findElement(By.xpath(" //button[@ondblclick='dblclickAlert()']  "));
		
		// Creating the object of Actions class
		Actions act = new Actions(driver);
		
		// To Double click using parameterized method of Actions class
		//act.doubleClick(doubleClickTarget).perform();
		
		// Double click using no argument method of Actions class
		act.moveToElement(doubleClickTarget).doubleClick(doubleClickTarget).perform();
		

	}

}
