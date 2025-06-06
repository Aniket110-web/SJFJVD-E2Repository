package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountAttribute {
	
	
  @Test (invocationCount = 0)
  public void lgoin() 
  {
	  Reporter.log("This is and Login Method", false);
  }
  
  @Test (invocationCount = 1)
  public void register() 
  {
	  Reporter.log("This is Register Method", true);
  }
  
  @Test (invocationCount = 2)
  public void addToCart() 
  {
	  Reporter.log("This is AddToCart Method", true);
  }
  
  
}
