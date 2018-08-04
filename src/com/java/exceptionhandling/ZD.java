package com.java.exceptionhandling;

public class ZD {

	
	public static void main(String[]args){
		
		try {
			int i=10;
			
		}
		catch(ArithmeticException ae){
			//System.out.println(i);
			//here local variable creation is required so if try without localvariable we will get compile time error
			//i=20;
			// assigning variable value is not possible here...
		}
		//System.out.println(i);
	}


}
