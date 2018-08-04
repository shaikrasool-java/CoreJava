package com.java.exceptionhandling;

public class Q {

	public static void main(String[]args){
		System.out.println("statement one");
	
		try{
			System.out.println("statement two");
		int i=10/0;
		System.out.println("statement theree");
		}
		catch(ArithmeticException ae){
			System.out.println("statement four"+ae);
		}
		System.out.println("statement five");
	}
}
