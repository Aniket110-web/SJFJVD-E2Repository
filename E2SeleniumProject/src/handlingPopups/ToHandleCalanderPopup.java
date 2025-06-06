package handlingPopups;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalanderPopup {

	public static void main(String[] args) {
		
		LocalDateTime todaysDate = LocalDateTime.now();
		System.out.println(todaysDate);
		Month month = todaysDate.getMonth();
		System.out.println(month);
		String newMonth = month.toString();
		System.out.println(newMonth);
		
		String monthName = newMonth.charAt(0)+newMonth.substring(1).toLowerCase();
		System.out.println(monthName);
		
		int day = todaysDate.getDayOfMonth();
		System.out.println(day);

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Declaring Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Launching the web Application
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.id("date-box")).click();
		
		driver.findElement(By.xpath("//div[text()='April']/../..//span[text()='29']")).click();

	}

}
