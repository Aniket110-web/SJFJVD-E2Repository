package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bugatiTC {
  @Test(groups = "ST")
  public void bugati() {
	  WebDriver dr = new ChromeDriver();
  dr.manage().window().maximize();
  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  dr.get("https://www.bugatti.com/");
  dr.quit(); 
}
}
