package com.java.exceptionhandling;

public class Z10 {

	public static void main(String[]args){
		 int i=test();
		 System.out.println(i);

	
	}

	private static int test() {
		try{
			
		}catch(ArithmeticException ae){
			
		}
		finally{
			return 10;
		}
//return 20;
// here compile time error will occur...we return the value in finally block ....	
	
	}
}
