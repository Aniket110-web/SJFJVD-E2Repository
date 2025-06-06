package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\QSpiders\\WebElements/dropdown.html");
		WebElement compDD = driver.findElement(By.name("companies"));
		Thread.sleep(1000);
		
		Select sel=new Select(compDD);
		
		sel.selectByIndex(2);

	}

}
