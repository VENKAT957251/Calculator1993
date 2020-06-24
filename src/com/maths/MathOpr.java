package com.maths;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MathOpr extends Calculator{
  @Test
 private void Sub() {
	
int sub1 = sub(6,5);
System.out.println("substraction sub1 is = "+sub1);
Assert.assertEquals(sub1,1);

}
  
  @Test
  private void div() {
	  double sub1 = div(780,5);
	  System.out.println("substration sub1 is = "+sub1);
	 Assert.assertEquals(sub1, 156);
  }
  
}
