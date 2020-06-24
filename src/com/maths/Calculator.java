package com.maths;

public class Calculator {

	
	public int sub(int a,int b) {
		
		
		int sub=a-b;
//		System.out.println("addition is "+sub);
		return sub;
	}
	
	public int add (int a,int b) {
		
		int add=a-b;
		return add;
		
	}
	
	
	public int mul(int a,int b) {
		int mul =a*b;
		return mul;
	}
	
	
	public double div (int a,int b) throws ArithmeticException {
		/*
		 * if(b==0) { throw new ArithmeticException("cannot Divide By 0"); } else {
		 * double c = a/b; return c; }
		 */
		
		try {
			double c = a/b;
			return c;
		}
		catch (ArithmeticException e) {
	        throw new  ArithmeticException("Error: Don't divide a number by zero");
	    }
		
	}
}
	

