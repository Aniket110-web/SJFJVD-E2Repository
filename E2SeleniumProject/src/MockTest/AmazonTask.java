package MockTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonTask {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		WebElement searchTB = driver.findElement(By.id("twotabsearchtextbox"));
		searchTB.sendKeys("iphone 16");
		searchTB.submit();
		
		WebElement priceWB = driver.findElement(By.className("a-price-whole"));
		String price = priceWB.getText();
		System.out.println(price);
		
		driver.findElement(By.id("a-autoid-17-announce"));
	}

}
                   
                		   
                		   