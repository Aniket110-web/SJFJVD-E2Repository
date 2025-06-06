import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.switchTo().activeElement().sendKeys("zomato",Keys.ENTER);
    
    
	}
}
