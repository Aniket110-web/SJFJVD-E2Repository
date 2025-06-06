import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/login");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    
	    //switching to activeElement
	    driver.switchTo().activeElement().sendKeys("Aniket");
	    

	}

}
