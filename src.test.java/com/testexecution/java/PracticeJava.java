package com.testexecution.java;

import com.main.program.Calculator;

public class PracticeJava extends Calculator{
	
	
	  public static void add() {
	  
	 int a=7; int b=7; int add=a+b; System.out.println("addition is "+add); }
	 
	  
	  public void add1() {
		  
			 int a=7; int b=10; int add=a+b; System.out.println("addition is "+add); }
	  
	  
	public static void main(String[] args) {
		
add();

PracticeJava ik = new PracticeJava();
Calculator kh = new Calculator();
ik.add1();
int fgh=kh.sub(9,7);
int sub1=kh.sub(6,7);
 

System.out.println("sub is = "+fgh+" sub1 is "+sub1);

	}

}
