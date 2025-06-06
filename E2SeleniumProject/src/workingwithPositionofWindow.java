
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithPositionofWindow {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		//To get position (x and y axis) of the window
		Point point = driver.manage().window().getPosition();
		
		int xaxis = (int) point.getX();//To get value of xaxis
		int yaxis = (int) point.getY();// To get value of yaxis
		
		System.out.println("X-axis is :"+xaxis+" Y-axis is:"+yaxis);
		Thread.sleep(2000);
		
		//Creating object of point and passing x and y values in pixals
		Point targetpoint = new Point(250,180);
		
		//To set the position of browser window
		driver.manage().window().setPosition(targetpoint);
	}

}
