package com.java.exceptionhandling;

public class U {

	public static void main(String[]args){
		System.out.println("statement one");
		
		try{
			System.out.println("statement two");
			int i= 10/0;
			System.out.println(i);
			System.out.println("statement three");
		}
		catch(NullPointerException npe){
			System.out.println("statment four");
			npe.printStackTrace();
		}
	System.out.println("statement five");
	}
	
}
