package com.testexecution.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.program.Calculator;



public class MathOpr extends Calculator{
	
	//Addition ,assertEquals, 
	  @Test
	  private void Add() {
		  
		  int b = add(20, 40);
		  System.out.println("addition of two num is = "+b);
		  Assert.assertEquals(b, 60);
	  }
	
	  // substartion, assertEquals
  @Test
 private void Sub() {
	
int sub1 = sub(6,5);
System.out.println("substraction two num is  = "+sub1);
Assert.assertEquals(sub1,1);
}
  
  //Division, assertNotEquals
  @Test
  private void div() {
//	  double div1 = div(780,4);
//	  System.out.println("Division of two num is  = "+div1);
	  double div2 = div(44,2);
	  System.out.println("div2 is = "+div2);
	  
//	 Assert.assertNotEquals(div1, 190);
	 Assert.assertEquals(div2,22);
  }
  
  
  
  //invertion,assertEquals
  @Test
  private void invert() {
	  
	  double inv = Inverse(156);
	  System.out.println("Inversion of a number is ="+inv);
	  Assert.assertEquals(inv, 0.00641025641025641);
	   
  }
  
  
  //Modulus,assertNotequals
  @Test
  private void Modulus() {
	  
	  int mod1 = mod(193, 10);
	  System.out.println("Modulus of a number is = "+mod1);
	  Assert.assertNotEquals(mod1, 10);   
  }
  
  //POW,assertTrue(true)
  
  @Test
  private void Powerof() {
	  
	  double b = Power(3, 4);
	  System.out.println("a^(b) , power of a number  is = "+b);
	  if(b==81)
		  Assert.assertTrue(true);
  }
  
  
  
//POW,assertFalse(true)
  
  @Test
  private void Powerof1() {
	  
	  double b = Power(4, 4);
	  System.out.println("a^(b) , power of a number  is = "+b);
	  if(b==256)
		  Assert.assertTrue(true);
  }
  
  
  //Negat of number, assertFalse(false)
  @Test
  private void Negate() {
	  
	  double v = Negatitiv(178);
	  System.out.println("negative of  given number is = "+v);
	  if(v==(-178))
	  Assert.assertFalse(false);
	  
  }
}
