package genericPackage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorklLib {

	//To Select An Option From DropDown Using Select Class
	public void selectByVisibleText(WebElement dropdown, String text) 
	{
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement dropdown, int index) 
	{
		Select sel = new Select(dropdown);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement dropdown, String value) 
	{
		Select sel = new Select(dropdown);
		sel.selectByValue(value);
	}
	

	//To Genarate Random Number
	public int randomNumber() 
	{
		Random random = new Random();
		int rn=random.nextInt(1000);
		return rn;
	}
	
}
