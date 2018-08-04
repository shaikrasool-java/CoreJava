package com.java.exceptionhandling;

//java.lang.NullPointerException
public class D {

	public static void main(String[]args){
		
		System.out.println("statement-start");
		Integer obj=null;
		int i=obj.intValue();
		System.out.println(i);
		
		System.out.println("statement-end");
				
	}
}
