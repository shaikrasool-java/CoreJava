package com.java.exceptionhandling;

public class Z16 {

	static int counter;
	public static void main(String[]args){
		System.out.println(1);
		test();
		System.out.println(2);
	}
	static void test(){
		System.out.println(3);
		
		try{
			System.out.println(4);
			
			if(counter++==3){
				int i=10/0;
			}
			test();
			System.out.println(5);
		}
		catch(ArithmeticException ae){
			System.out.println(6);
		}
		System.out.println(7);
	}
}
