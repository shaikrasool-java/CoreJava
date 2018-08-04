package com.java.exceptionhandling;

public class Z11 {

	public static void main(String[]args){
		
		System.out.println(1);
		test();
		System.out.println(2);
	}
		public static void test(){
	
			System.out.println(3);
			int i=10/0;
			System.out.println(4);
		}
	
}
