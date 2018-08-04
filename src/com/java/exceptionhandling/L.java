package com.java.exceptionhandling;

public class L {

	public static void main(String []args){
		
		System.out.println("statement-start");
		
		
		try{
			System.out.println("statement start from try block");
			int i=10/0;
			System.out.println(i);
			System.out.println("statement ends from try block");
			
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("statement from catch block");
		}
		System.out.println("statements end...");
	}
}
