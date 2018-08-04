package com.java.exceptionhandling;

public class Z6 {

	public static void main(String[]args){
		
		System.out.println(1);
		try{
			System.out.println(2);
			System.exit(0);
			System.out.println(3);
		}
		catch(ArithmeticException ae){
			System.out.println(4);
		}
		finally{
			System.out.println(5);
		}
		System.out.println(6);
	}
}
