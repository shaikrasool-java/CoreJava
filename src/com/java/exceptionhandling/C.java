package com.java.exceptionhandling;
//java.lang.StringIndexOutOfBoundsException
public class C {
	public static void main(String[]args){
		System.out.println("statement-start");
		char ch="abc".charAt(9);
		System.out.println(ch);
		System.out.println("statement-end");
	}

}
