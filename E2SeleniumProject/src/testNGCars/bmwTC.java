package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bmwTC {
  @Test(groups = "IT")
  public void bmw() {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dr.get("https://www.bmw-bavariamotors.in/");
	  dr.quit(); 
  }
} 
