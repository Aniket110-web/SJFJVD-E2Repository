package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityHelperAttribute {
	 @Test (priority = 2)
	  public void lgoin() 
	  {
		  Reporter.log("This is Login Method", true);
	  }
	  
	  @Test (priority =  -3)
	  public void register() 
	  {
		  Reporter.log("This is Register Method", true);
	  }
	  
	  @Test (priority  =5)
	  public void addToCart() 
	  {
		  Reporter.log("This is AddToCart Method", true);
	  }
}
