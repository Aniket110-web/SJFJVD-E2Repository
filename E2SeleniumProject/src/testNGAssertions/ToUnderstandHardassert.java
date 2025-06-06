package testNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardassert {
  @Test
  public void verifyUsingHardAssert() 
  {
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 String expectedTitleofElectronicsPage="Demo Web Shop. Electronics";
	 
	 driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	 
//	 String actualTitleofElectronicsPage = driver.getTitle();
//	 
//	 if(actualTitleofElectronicsPage.equals(expectedTitleofElectronicsPage))
//	 {
//		 System.out.println("Electronics page is displayed");
//	 }
//	 else
//	 {
//		 System.out.println("Electronics page is not displayed");
//	 }
	Assert.assertEquals(driver.getTitle(), expectedTitleofElectronicsPage, "Electronics page is not displayed");

	 driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	 
	 String expectedCellPhonePageTitle = "Demo Web Shop. Cell phones";
	 
	 Assert.assertEquals(driver.getTitle(), expectedCellPhonePageTitle, "Cell Phone page is not displayed");
	 
  }
}
