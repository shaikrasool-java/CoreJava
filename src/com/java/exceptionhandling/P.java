package com.java.exceptionhandling;

public class P {
	
	public static void main(String []args){
		
		System.out.println("statement one");
		
		try{
			System.out.println("statement two");
			main(args);
			System.out.println("statement three");
			}
	catch(StackOverflowError sof){
		System.out.println("statement four");
	}
	
		System.out.println("statement five");
	}

}
