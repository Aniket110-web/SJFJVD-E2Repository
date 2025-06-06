package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		
		WebElement dayDD= driver.findElement(By.id("day"));
		WebElement monthDD= driver.findElement(By.id("month"));
		WebElement yearDD= driver.findElement(By.id("year"));
		Thread.sleep(1000);
		
		
		Select day= new Select(dayDD);
		day.selectByIndex(19);
		Thread.sleep(1000);
		
		Select month= new Select(monthDD);
		month.selectByValue("7");
		Thread.sleep(1000);
		
		Select year= new Select(yearDD);
		year.selectByVisibleText("2003");

	}

}
