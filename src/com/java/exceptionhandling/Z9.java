package com.java.exceptionhandling;

import java.util.Scanner;

public class Z9 {

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter something");
		String s1=sc.next();
		int i=test(s1);
		System.out.println(i);
		
	
	}
	static int test(String s1){
		try{
			int j=Integer.parseInt(s1);
		}catch(ArithmeticException ae){
			return 0;
		}
		finally{
			return 143;
			
		}
	}
	
}
