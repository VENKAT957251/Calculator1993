package com.testexecution.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.program.TestNG_DataProviders;

public class MathsDataprovider extends TestNG_DataProviders {
  
	
	//Addition ,assertEquals, 
	  @Test(dataProvider="inputs")
	  private void Add(int n1,int n2) {
		  
		  int b = add(n1, n2);
		  System.out.println("addition of two num is = "+b);
		  Assert.assertEquals(b, 60);
	  }
	
	  // substartion, assertEquals
@Test(dataProvider="inputs")
private void Sub(int n1, int n2) {
	
int sub1 = sub(n1, n2);
System.out.println("substraction two num is  = "+sub1);
Assert.assertEquals(sub1,60);
}

//Division, assertNotEquals
@Test(dataProvider="inputs")
private  void division(double n1,double n2) {

	  double div2 = div(n1,n2);
	  System.out.println("div2 is = "+div2);
   	 Assert.assertEquals(div2,22);
	
}



//invertion,assertEquals
@Test(dataProvider="inputs1")
private void invert(double n1) {
	  
	  double inv = Inverse(n1);
	  System.out.println("Inversion of a number is ="+inv);
	  Assert.assertEquals(inv, 0.99);
	   
}


//Modulus,assertNotequals
@Test(dataProvider="inputs")
private void Modulus(int n1,int n2) {
	  
	  int mod1 = mod(n1, n2);
	  System.out.println("Modulus of a number is = "+mod1);
	  Assert.assertNotEquals(mod1, 10);   
}

//POW,assertTrue(true)

@Test(dataProvider="inputs")
private void Powerof(double n1,double n2) {
	  
	  double b = Power(n1, n2);
	  System.out.println("a^(b) , power of a number  is = "+b);
	  if(b==81)
		  Assert.assertTrue(true);
}



//POW,assertFalse(true)

@Test(dataProvider="inputs")
private void Powerof1(double n1,double n2) {
	  
	  double b = Power(n1, n2);
	  System.out.println("a^(b) , power of a number  is = "+b);
	  if(b==256)
		  Assert.assertFalse(true);
}


//Negat of number, assertFalse(false)
@Test(dataProvider="inputs1")
private void Negate(double n1) {
	  
	  double v = Negatitiv(n1);
	  System.out.println("negative of  given number is = "+v);
	  if(v==(-178))
	  Assert.assertFalse(false);
	  
}
	
	
}
