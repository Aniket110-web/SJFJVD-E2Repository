package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rollsRoyceTC {
  @Test(groups = "RT")
  public void rollsRoyce() {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dr.get("https://www.rolls-roycemotorcars.com/");
	  dr.quit();
  }
}
