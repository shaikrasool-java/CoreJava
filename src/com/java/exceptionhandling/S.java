package com.java.exceptionhandling;

public class S {

	public static void main(String[]args){
		System.out.println("statement one");
		try{
			System.out.println("statement two");
			int i=10/0;
			System.out.println("statement three");
		}catch(ArithmeticException ae){
			System.out.println("statement four");
			ae.printStackTrace();
		}
		System.out.println("statement five");
	}
}
