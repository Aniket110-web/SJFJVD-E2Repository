package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement multiselectDD = driver.findElement(By.id("multiselect1"));
		
		Select sel=new Select(multiselectDD);
		
		sel.selectByIndex(0);
		Thread.sleep(1000);
		
		sel.selectByValue("audix");
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Swift");
		Thread.sleep(1000);
		
		sel.deselectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		sel.deselectByValue("swiftx");
		Thread.sleep(1000);
		
		sel.deselectByIndex(3);
		Thread.sleep(1000);

	}

}
