package com.java.exceptionhandling;

public class Z5 {

	public static void main(String[]args){
		
		System.out.println(1);
		if(true){
			System.out.println(2);
			return;
		}
		try{
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
