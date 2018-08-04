package com.java.exceptionhandling;

public class Z2 {

	public static void main(String[]args){
		System.out.println(1);
		int i=10/0;
		try {
			System.out.println(2);
		}
		catch(ArithmeticException ae){
			System.out.println(3);
		}
		finally{
			System.out.println(4);
		}
	System.out.println(5);
	}
	
}
	
	
	

	
	//here finally block won't be executed becoz of exception raised at line no 7
	//if exception raised in try block to coressponding catch block will excutes as well as finally block too...
	
