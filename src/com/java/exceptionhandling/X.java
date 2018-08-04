package com.java.exceptionhandling;

import java.util.Scanner;

public class X {

	public static void main(String[]args){
		System.out.println(1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		String s1=sc.next();
	
		try{
			System.out.println(2);
			int i=Integer.parseInt(s1);
			System.out.println(3);
			int k=i/(i-9);
			System.out.println(4);
			
		}catch(ArithmeticException ae){
			System.out.println(5);
			System.out.println(ae);
			
		}
		
	
	System.out.println(6);
	}
	
	
}
