package com.java.exceptionhandling;

public class W {

	public static void main(String[]args){
		
		System.out.println("statement one");
		
		try{
			System.out.println("statement two");
			int i=10/0;
			System.out.println("statement three");
		}catch(ArithmeticException ae){
			System.out.println("statement four");
			System.out.println(ae);
			 
			try{
				System.out.println("statement five");
				int j=10/0;
				System.out.println("statement six");
			}
			catch(ArithmeticException ae1){
				System.out.println("statement seven");
				System.out.println(ae1);
				
				
			}
			System.out.println("statement eight");
		}
	
	
	}
}
