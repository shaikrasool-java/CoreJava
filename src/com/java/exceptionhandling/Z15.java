package com.java.exceptionhandling;

public class Z15 {

	public static void main(String[]args){
		
		System.out.println(1);
		try{
			System.out.println(2);
			test1();
			System.out.println(3);
		}
		catch(ArithmeticException ae){
			System.out.println(4);
		}
		System.out.println(5);
	}
	public static void test1(){
		System.out.println(6);
		int i=10/0;
		System.out.println(7);
	}
}
