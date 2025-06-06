package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfieldBike {

	 @Test(groups = "RT")
	  public void royalEnfiled() {
		  WebDriver dr = new ChromeDriver();
		  dr.manage().window().maximize();
		  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  dr.get("https://www.royalenfield.com/");
		  dr.quit();
	  }
}
