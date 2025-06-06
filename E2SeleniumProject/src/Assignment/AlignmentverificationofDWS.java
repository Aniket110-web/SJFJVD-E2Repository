package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignmentverificationofDWS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTB=driver.findElement(By.id("Email"));
		Thread.sleep(1000);
		
		Rectangle rect = emailTB.getRect();
		int widthemail = rect.getWidth();
		int heightemail = rect.getHeight();
		int xaxisemail = rect.getX();
		int yaxisemail = rect.getY();
		
		System.out.println("Widthemail is :"+widthemail+" Heightemail is :"+heightemail+" X-Axisemail is :"+xaxisemail+" Y-Axisemail is : "+yaxisemail);
		
		WebElement passwordTB = driver.findElement(By.id("Password"));
		Thread.sleep(1000);
		
		Rectangle rect2 = passwordTB.getRect();
		int widthpass = rect2.getWidth();
		int heightpass = rect2.getHeight();
		int xaxispass = rect2.getX();
		int yaxispass = rect2.getY();
		
		System.out.println("Widthpass is :"+widthpass+" Heightpass is :"+heightpass+" X-Axispass is :"+xaxispass+" Y-Axispass is : "+yaxispass);
		
		int leftalignment=(xaxisemail - xaxispass);
		if(leftalignment > -5 && leftalignment < 5) 
		{
			System.out.println("Left Alignment is correct");
		}
		else 
		{
			System.out.println("Left Alignment is not correct");

		}
		
		int Rightalignment=((xaxisemail + widthemail) - (xaxispass + widthpass));
		if(Rightalignment > -5 && Rightalignment < 5) 
		{
			System.out.println("Right Alignment is correct");
			
		}
		else
		{
			System.out.println("Right Alignment is not correct");
		}
		int isOverlap =yaxispass - (yaxisemail + heightemail);
		
		if(isOverlap > 0)
		{
			System.out.println("Textboxes are not overlapping");
			
		}
		else
		{
			System.out.println("Textboxes are overlapping");
		}

	}

}
