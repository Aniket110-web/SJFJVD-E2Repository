package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethosHelperAttribute {
  @Test(dependsOnMethods = "addToCart")
  public void buyProduct() 
  {
	  Reporter.log("This Is Buy Product Method", true);
  }
  
  @Test(dependsOnMethods = "register")
  public void login() 
  {
	  int a=10;
	  System.out.println(a/0);
	  Reporter.log("This is Login Method", true);
	  
  }
  
  @Test
  public void register() 
  {
	  Reporter.log("This is Register Method", true);
  }
  
  @Test (dependsOnMethods = {"register","login"})
  public void addToCart() 
  {
	  Reporter.log("This is AddToCart Method", true);
  }
}

