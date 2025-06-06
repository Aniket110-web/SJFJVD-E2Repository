package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HarleyaDavidsonBikeTC {
  @Test(groups = "IT")
  public void harleyDavidson() {
  
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dr.get("https://www.harley-davidson.com/");
	  dr.quit();
  
  
  }
}
