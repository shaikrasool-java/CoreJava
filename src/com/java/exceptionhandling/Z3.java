package com.java.exceptionhandling;

public class Z3 {
	public static void main(String[]args){
		
		System.out.println(1);
		try{
			System.out.println(2);
			
			if(true){
				System.out.println(3);
				return;
				
			}
		}catch(ArithmeticException ae){
			System.out.println(5);
			
		}
		finally{
			System.out.println(6);
		}
		System.out.println(7);
	}

}
