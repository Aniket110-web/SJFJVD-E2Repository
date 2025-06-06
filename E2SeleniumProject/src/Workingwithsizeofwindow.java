
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithsizeofwindow {
public static void main(String[]args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	Dimension size = driver.manage().window().getSize();// To get the dimension of browser window
	
	int height = size.getHeight();// To get the height of the browser window
	int width = size.getWidth();// To get the width of the window
	
	System.out.print("Height is :"+height+"  width is "+width+""); //To print the height and width  

    Dimension targetsize = new Dimension(500,300); //Objest of dimension class to specify width and height
    driver.manage().window().setSize(targetsize); // Pass the specified dimension to setsize
    		
}
}
